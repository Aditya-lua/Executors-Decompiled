; X509V3_add_value_uchar @ 00b05a80
00b05a80	str x21,[sp, #-0x30]!
00b05a84	stp x20,x19,[sp, #0x10]
00b05a88	mov x19,x2
00b05a8c	mov x20,x1
00b05a90	mov x21,x0
00b05a94	stp x29,x30,[sp, #0x20]
00b05a98	add x29,sp,#0x20
00b05a9c	cbz x1,0x00b05ab0
00b05aa0	mov x0,x20
00b05aa4	bl 0x00c2ff50
00b05aa8	mov x2,x0
00b05aac	b 0x00b05ab4
00b05ab0	mov x2,xzr
00b05ab4	mov x1,x20
00b05ab8	mov x3,x19
00b05abc	ldp x29,x30,[sp, #0x20]
00b05ac0	ldp x20,x19,[sp, #0x10]
00b05ac4	mov x0,x21
00b05ac8	ldr x21,[sp], #0x30
00b05acc	b 0x00b0590c
