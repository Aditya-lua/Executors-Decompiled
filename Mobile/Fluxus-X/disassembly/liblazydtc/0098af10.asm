; FUN_0098af10 @ 0098af10
0098af10	stp x20,x19,[sp, #-0x20]!
0098af14	stp x29,x30,[sp, #0x10]
0098af18	add x29,sp,#0x10
0098af1c	ldr x20,[x0, #0x8]
0098af20	add x19,x20,#0x210
0098af24	mov x0,x19
0098af28	bl 0x00c2ff10
0098af2c	mov w8,#0x1
0098af30	mov x0,x19
0098af34	strb w8,[x20, #0x238]
0098af38	bl 0x00c2ff20
0098af3c	ldp x29,x30,[sp, #0x10]
0098af40	add x0,x20,#0x1e0
0098af44	ldp x20,x19,[sp], #0x20
0098af48	b 0x00c315f0
