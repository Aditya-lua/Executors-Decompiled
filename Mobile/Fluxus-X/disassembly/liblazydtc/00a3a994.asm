; ossl_ec_GFp_simple_is_on_curve @ 00a3a994
00a3a994	sub sp,sp,#0x70
00a3a998	stp x28,x27,[sp, #0x10]
00a3a99c	stp x26,x25,[sp, #0x20]
00a3a9a0	stp x24,x23,[sp, #0x30]
00a3a9a4	stp x22,x21,[sp, #0x40]
00a3a9a8	stp x20,x19,[sp, #0x50]
00a3a9ac	stp x29,x30,[sp, #0x60]
00a3a9b0	add x29,sp,#0x60
00a3a9b4	mov x19,x2
00a3a9b8	mov x22,x1
00a3a9bc	mov x21,x0
00a3a9c0	bl 0x00c3ae10
00a3a9c4	cbz w0,0x00a3a9d0
00a3a9c8	mov w21,#0x1
00a3a9cc	b 0x00a3ac3c
00a3a9d0	ldr x8,[x21]
00a3a9d4	ldr x23,[x21, #0x40]
00a3a9d8	mov x20,xzr
00a3a9dc	ldp x25,x28,[x8, #0xf8]
00a3a9e0	cbnz x19,0x00a3a9f8
00a3a9e4	ldr x0,[x21, #0xa8]
00a3a9e8	bl 0x00c38a60
00a3a9ec	mov x20,x0
00a3a9f0	mov x19,x0
00a3a9f4	cbz x0,0x00a3aad4
00a3a9f8	mov x0,x19
00a3a9fc	bl 0x00c38a90
00a3aa00	mov x0,x19
00a3aa04	bl 0x00c38a40
00a3aa08	mov x24,x0
00a3aa0c	mov x0,x19
00a3aa10	bl 0x00c38a40
00a3aa14	str x0,[sp, #0x8]
00a3aa18	mov x0,x19
00a3aa1c	bl 0x00c38a40
00a3aa20	mov x27,x0
00a3aa24	mov x0,x19
00a3aa28	bl 0x00c38a40
00a3aa2c	cbz x0,0x00a3ac28
00a3aa30	ldr x2,[x22, #0x10]
00a3aa34	mov x26,x0
00a3aa38	mov x0,x21
00a3aa3c	mov x1,x24
00a3aa40	mov x3,x19
00a3aa44	blr x28
00a3aa48	cbz w0,0x00a3ac28
00a3aa4c	ldr w8,[x22, #0x28]
00a3aa50	cbz w8,0x00a3aadc
00a3aa54	ldr x2,[x21, #0x60]
00a3aa58	mov x0,x24
00a3aa5c	mov x1,x24
00a3aa60	mov x3,x23
00a3aa64	bl 0x00c38ec0
00a3aa68	cbz w0,0x00a3ac28
00a3aa6c	ldr x3,[x22, #0x10]
00a3aa70	mov x0,x21
00a3aa74	mov x1,x24
00a3aa78	mov x2,x24
00a3aa7c	mov x4,x19
00a3aa80	blr x25
00a3aa84	cbz w0,0x00a3ac28
00a3aa88	ldr x2,[x21, #0x68]
00a3aa8c	mov x0,x24
00a3aa90	mov x1,x24
00a3aa94	mov x3,x23
00a3aa98	bl 0x00c38ec0
00a3aa9c	cbz w0,0x00a3ac28
00a3aaa0	mov x0,x21
00a3aaa4	ldr x21,[sp, #0x8]
00a3aaa8	ldr x2,[x22, #0x18]
00a3aaac	mov x3,x19
00a3aab0	mov x1,x21
00a3aab4	blr x28
00a3aab8	cbz w0,0x00a3ac28
00a3aabc	mov x0,x21
00a3aac0	mov x1,x24
00a3aac4	bl 0x00c369c0
00a3aac8	cmp w0,#0x0
00a3aacc	cset w21,eq
00a3aad0	b 0x00a3ac2c
00a3aad4	mov w21,#0xffffffff
00a3aad8	b 0x00a3ac3c
00a3aadc	str x23,[sp]
00a3aae0	ldr x23,[sp, #0x8]
00a3aae4	ldr x2,[x22, #0x20]
00a3aae8	mov x0,x21
00a3aaec	mov x3,x19
00a3aaf0	mov x1,x23
00a3aaf4	blr x28
00a3aaf8	cbz w0,0x00a3ac28
00a3aafc	mov x0,x21
00a3ab00	mov x1,x27
00a3ab04	mov x2,x23
00a3ab08	mov x3,x19
00a3ab0c	blr x28
00a3ab10	cbz w0,0x00a3ac28
00a3ab14	mov x0,x21
00a3ab18	mov x1,x26
00a3ab1c	mov x2,x27
00a3ab20	mov x3,x23
00a3ab24	mov x4,x19
00a3ab28	blr x25
00a3ab2c	cbz w0,0x00a3ac28
00a3ab30	ldr w8,[x21, #0x70]
00a3ab34	cbz w8,0x00a3aba0
00a3ab38	ldp x23,x0,[sp]
00a3ab3c	mov x1,x27
00a3ab40	mov x2,x23
00a3ab44	bl 0x00c38ed0
00a3ab48	cbz w0,0x00a3ac28
00a3ab4c	ldr x0,[sp, #0x8]
00a3ab50	mov x2,x27
00a3ab54	mov x3,x23
00a3ab58	mov x1,x0
00a3ab5c	bl 0x00c38ec0
00a3ab60	cbz w0,0x00a3ac28
00a3ab64	ldr x27,[sp, #0x8]
00a3ab68	mov x0,x24
00a3ab6c	mov x1,x24
00a3ab70	mov x3,x23
00a3ab74	mov x2,x27
00a3ab78	bl 0x00c38f20
00a3ab7c	cbz w0,0x00a3ac28
00a3ab80	ldr x3,[x22, #0x10]
00a3ab84	mov x0,x21
00a3ab88	mov x1,x24
00a3ab8c	mov x2,x24
00a3ab90	mov x4,x19
00a3ab94	blr x25
00a3ab98	cbnz w0,0x00a3abfc
00a3ab9c	b 0x00a3ac28
00a3aba0	ldr x23,[sp, #0x8]
00a3aba4	ldr x3,[x21, #0x60]
00a3aba8	mov x0,x21
00a3abac	mov x2,x27
00a3abb0	mov x1,x23
00a3abb4	mov x4,x19
00a3abb8	blr x25
00a3abbc	cbz w0,0x00a3ac28
00a3abc0	ldr x3,[sp]
00a3abc4	mov x0,x24
00a3abc8	mov x1,x24
00a3abcc	mov x2,x23
00a3abd0	bl 0x00c38ec0
00a3abd4	cbz w0,0x00a3ac28
00a3abd8	ldr x3,[x22, #0x10]
00a3abdc	mov x0,x21
00a3abe0	mov x1,x24
00a3abe4	mov x2,x24
00a3abe8	mov x4,x19
00a3abec	mov x27,x23
00a3abf0	blr x25
00a3abf4	ldr x23,[sp]
00a3abf8	cbz w0,0x00a3ac28
00a3abfc	ldr x2,[x21, #0x68]
00a3ac00	mov x0,x21
00a3ac04	mov x1,x27
00a3ac08	mov x3,x26
00a3ac0c	mov x4,x19
00a3ac10	blr x25
00a3ac14	cbz w0,0x00a3ac28
00a3ac18	mov x0,x24
00a3ac1c	mov x1,x24
00a3ac20	mov x2,x27
00a3ac24	b 0x00a3aa94
00a3ac28	mov w21,#0xffffffff
00a3ac2c	mov x0,x19
00a3ac30	bl 0x00c38a20
00a3ac34	mov x0,x20
00a3ac38	bl 0x00c38a30
00a3ac3c	mov w0,w21
00a3ac40	ldp x29,x30,[sp, #0x60]
00a3ac44	ldp x20,x19,[sp, #0x50]
00a3ac48	ldp x22,x21,[sp, #0x40]
00a3ac4c	ldp x24,x23,[sp, #0x30]
00a3ac50	ldp x26,x25,[sp, #0x20]
00a3ac54	ldp x28,x27,[sp, #0x10]
00a3ac58	add sp,sp,#0x70
00a3ac5c	ret
