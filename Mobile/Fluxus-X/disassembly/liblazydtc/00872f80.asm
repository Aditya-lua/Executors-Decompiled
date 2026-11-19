; FUN_00872f80 @ 00872f80
00872f80	stp x29,x30,[sp, #-0x30]!
00872f84	stp x22,x21,[sp, #0x10]
00872f88	stp x20,x19,[sp, #0x20]
00872f8c	mov x29,sp
00872f90	ldrb w8,[x0, #0x8]
00872f94	tbnz w8,#0x0,0x00872fec
00872f98	ldr x20,[x0]
00872f9c	mov x19,x0
00872fa0	ldr x21,[x20]
00872fa4	cbz x21,0x00872fec
00872fa8	ldr x8,[x20, #0x8]
00872fac	mov x0,x21
00872fb0	mov x9,x20
00872fb4	cmp x21,x8
00872fb8	b.eq 0x00873004
00872fbc	mov x22,x8
00872fc0	b 0x00872fd0
00872fc4	cmp x22,x21
00872fc8	mov x8,x22
00872fcc	b.eq 0x00872ffc
00872fd0	ldrb w9,[x22, #-0x18]!
00872fd4	tbz w9,#0x0,0x00872fc4
00872fd8	ldur x0,[x8, #-0x8]
00872fdc	ldur x8,[x8, #-0x18]
00872fe0	and x1,x8,#-0x2
00872fe4	bl 0x00c2fe80
00872fe8	b 0x00872fc4
00872fec	ldp x20,x19,[sp, #0x20]
00872ff0	ldp x22,x21,[sp, #0x10]
00872ff4	ldp x29,x30,[sp], #0x30
00872ff8	ret
00872ffc	ldr x9,[x19]
00873000	ldr x0,[x9]
00873004	ldr x8,[x9, #0x10]
00873008	str x21,[x20, #0x8]
0087300c	sub x1,x8,x0
00873010	ldp x20,x19,[sp, #0x20]
00873014	ldp x22,x21,[sp, #0x10]
00873018	ldp x29,x30,[sp], #0x30
0087301c	b 0x00c2fe80
