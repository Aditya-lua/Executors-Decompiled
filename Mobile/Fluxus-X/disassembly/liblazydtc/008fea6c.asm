; FUN_008fea6c @ 008fea6c
008fea6c	sub sp,sp,#0x50
008fea70	str x23,[sp, #0x10]
008fea74	stp x22,x21,[sp, #0x20]
008fea78	stp x20,x19,[sp, #0x30]
008fea7c	stp x29,x30,[sp, #0x40]
008fea80	add x29,sp,#0x40
008fea84	mov x19,x2
008fea88	mov x20,x1
008fea8c	mov x21,x0
008fea90	bl 0x00c31900
008fea94	ldr x8,[x19]
008fea98	sub x22,x8,x0
008fea9c	cmp x22,#0x1
008feaa0	b.lt 0x008feb10
008feaa4	bl 0x00c31900
008feaa8	bl 0x00c31910
008feaac	mov x23,x0
008feab0	mov x0,x22
008feab4	bl 0x00c2ae48
008feab8	adrp x8,0x29c000
008feabc	mov v1.16B,v0.16B
008feac0	ldr q0,[x8, #0x120]
008feac4	bl 0x00c2b358
008feac8	mov x0,x23
008feacc	str q0,[sp]
008fead0	bl 0x00c2ae48
008fead4	adrp x8,0x29c000
008fead8	ldr q1,[x8, #0xe30]
008feadc	bl 0x00c2aeac
008feae0	ldr q1,[sp]
008feae4	bl 0x00c2acf4
008feae8	cmp w0,#0x0
008feaec	b.ge 0x008feafc
008feaf0	mov w8,#0x3e8
008feaf4	madd x2,x23,x8,x22
008feaf8	b 0x008feb00
008feafc	orr x2,xzr,#0x7fffffffffffffff
008feb00	mov x0,x21
008feb04	mov x1,x20
008feb08	bl 0x00c318e0
008feb0c	bl 0x00c31900
008feb10	bl 0x00c31900
008feb14	ldr x8,[x19]
008feb18	ldp x29,x30,[sp, #0x40]
008feb1c	ldp x20,x19,[sp, #0x30]
008feb20	ldp x22,x21,[sp, #0x20]
008feb24	ldr x23,[sp, #0x10]
008feb28	cmp x0,x8
008feb2c	cset w0,ge
008feb30	add sp,sp,#0x50
008feb34	ret
