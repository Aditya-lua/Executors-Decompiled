; FUN_00825fc8 @ 00825fc8
00825fc8	stp x29,x30,[sp, #-0x20]!
00825fcc	str x19,[sp, #0x10]
00825fd0	mov x29,sp
00825fd4	ldrb w8,[x0, #0x18]
00825fd8	mov x19,x0
00825fdc	tbz w8,#0x0,0x00825ff0
00825fe0	ldr x8,[x19, #0x18]
00825fe4	ldr x0,[x19, #0x28]
00825fe8	and x1,x8,#-0x2
00825fec	bl 0x00c2fe80
00825ff0	ldrb w8,[x19]
00825ff4	tbnz w8,#0x0,0x00826004
00825ff8	ldr x19,[sp, #0x10]
00825ffc	ldp x29,x30,[sp], #0x20
00826000	ret
00826004	ldr x8,[x19]
00826008	ldr x0,[x19, #0x10]
0082600c	and x1,x8,#-0x2
00826010	ldr x19,[sp, #0x10]
00826014	ldp x29,x30,[sp], #0x20
00826018	b 0x00c2fe80
