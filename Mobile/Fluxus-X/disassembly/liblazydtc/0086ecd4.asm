; FUN_0086ecd4 @ 0086ecd4
0086ecd4	ldrb w8,[x0, #0x18]
0086ecd8	tbnz w8,#0x0,0x0086ed28
0086ecdc	stp x29,x30,[sp, #-0x20]!
0086ece0	stp x20,x19,[sp, #0x10]
0086ece4	mov x29,sp
0086ece8	ldp x9,x8,[x0, #0x8]
0086ecec	ldr x19,[x8]
0086ecf0	ldr x20,[x9]
0086ecf4	b 0x0086ecfc
0086ecf8	sub x19,x19,#0x28
0086ecfc	cmp x19,x20
0086ed00	b.eq 0x0086ed20
0086ed04	ldurb w8,[x19, #-0x18]
0086ed08	tbz w8,#0x0,0x0086ecf8
0086ed0c	ldur x8,[x19, #-0x18]
0086ed10	ldur x0,[x19, #-0x8]
0086ed14	and x1,x8,#-0x2
0086ed18	bl 0x00c2fe80
0086ed1c	b 0x0086ecf8
0086ed20	ldp x20,x19,[sp, #0x10]
0086ed24	ldp x29,x30,[sp], #0x20
0086ed28	ret
