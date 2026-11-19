; FUN_0092bab8 @ 0092bab8
0092bab8	stp x20,x19,[sp, #-0x20]!
0092babc	stp x29,x30,[sp, #0x10]
0092bac0	add x29,sp,#0x10
0092bac4	ldr x20,[x0, #0x20]
0092bac8	mov x19,x0
0092bacc	cbz x20,0x0092baec
0092bad0	mov x0,x20
0092bad4	mov x1,x19
0092bad8	bl 0x00907e2c
0092badc	add x0,x20,#0x3d0
0092bae0	add x1,x19,#0x40
0092bae4	mov x2,xzr
0092bae8	bl 0x00925d80
0092baec	str xzr,[x19, #0x20]
0092baf0	ldp x29,x30,[sp, #0x10]
0092baf4	ldp x20,x19,[sp], #0x20
0092baf8	ret
