; FUN_00a1abb8 @ 00a1abb8
00a1abb8	sub sp,sp,#0x60
00a1abbc	stp x26,x25,[sp, #0x10]
00a1abc0	stp x24,x23,[sp, #0x20]
00a1abc4	stp x22,x21,[sp, #0x30]
00a1abc8	stp x20,x19,[sp, #0x40]
00a1abcc	stp x29,x30,[sp, #0x50]
00a1abd0	add x29,sp,#0x50
00a1abd4	mov x20,x4
00a1abd8	mov w23,w3
00a1abdc	mov x22,x2
00a1abe0	mov w21,w1
00a1abe4	mov x19,x0
00a1abe8	bl 0x00c38de0
00a1abec	mov x1,x0
00a1abf0	mov x0,x19
00a1abf4	bl 0x00c38cc0
00a1abf8	cmp w0,#0x1
00a1abfc	b.lt 0x00a1ac24
00a1ac00	mov x0,x19
00a1ac04	bl 0x00c38d10
00a1ac08	cbz w0,0x00a1ac2c
00a1ac0c	orr w1,wzr,#0x3
00a1ac10	mov x0,x19
00a1ac14	bl 0x00c38d30
00a1ac18	cbz w0,0x00a1ac40
00a1ac1c	mov w23,#0x1
00a1ac20	b 0x00a1ad80
00a1ac24	mov w23,wzr
00a1ac28	b 0x00a1ad80
00a1ac2c	mov w1,#0x2
00a1ac30	mov x0,x19
00a1ac34	bl 0x00c38d30
00a1ac38	mov w23,w0
00a1ac3c	b 0x00a1ad80
00a1ac40	cbz w23,0x00a1ad2c
00a1ac44	mov x0,x19
00a1ac48	bl 0x00c322f0
00a1ac4c	cmp w0,#0x201
00a1ac50	b.ge 0x00a1ac5c
00a1ac54	mov w24,#0x40
00a1ac58	b 0x00a1ac8c
00a1ac5c	cmp w0,#0x401
00a1ac60	b.ge 0x00a1ac6c
00a1ac64	mov w24,#0x80
00a1ac68	b 0x00a1ac8c
00a1ac6c	cmp w0,#0x801
00a1ac70	b.ge 0x00a1ac7c
00a1ac74	orr w24,wzr,#0x180
00a1ac78	b 0x00a1ac8c
00a1ac7c	cmp w0,#0x1, LSL #12
00a1ac80	mov w8,#0x800
00a1ac84	mov w9,#0x400
00a1ac88	csel x24,x9,x8,le
00a1ac8c	adrp x26,0x753000
00a1ac90	mov w25,#0x1
00a1ac94	add x26,x26,#0x948
00a1ac98	ldrh w23,[x26, x25, LSL #0x1]
00a1ac9c	mov x0,x19
00a1aca0	mov x1,x23
00a1aca4	bl 0x00c39200
00a1aca8	cmn x0,#0x1
00a1acac	b.eq 0x00a1acfc
00a1acb0	cbz x0,0x00a1ad04
00a1acb4	add x25,x25,#0x1
00a1acb8	cmp x25,x24
00a1acbc	b.cc 0x00a1ac98
00a1acc0	cbz x20,0x00a1ad2c
00a1acc4	ldr w8,[x20]
00a1acc8	cmp w8,#0x2
00a1accc	b.eq 0x00a1ad10
00a1acd0	cmp w8,#0x1
00a1acd4	b.ne 0x00a1acfc
00a1acd8	ldr x8,[x20, #0x10]
00a1acdc	cbz x8,0x00a1ad2c
00a1ace0	ldr x2,[x20, #0x8]
00a1ace4	mov w0,#0x1
00a1ace8	mov w1,#0xffffffff
00a1acec	blr x8
00a1acf0	mov x24,xzr
00a1acf4	cbnz x22,0x00a1ad44
00a1acf8	b 0x00a1ad34
00a1acfc	mov w23,#0xffffffff
00a1ad00	b 0x00a1ad80
00a1ad04	mov x0,x19
00a1ad08	mov x1,x23
00a1ad0c	b 0x00a1ac34
00a1ad10	ldr x8,[x20, #0x10]
00a1ad14	mov w0,#0x1
00a1ad18	mov w1,#0xffffffff
00a1ad1c	mov x2,x20
00a1ad20	mov w23,#0xffffffff
00a1ad24	blr x8
00a1ad28	cbz w0,0x00a1ad80
00a1ad2c	mov x24,xzr
00a1ad30	cbnz x22,0x00a1ad44
00a1ad34	bl 0x00c38a50
00a1ad38	mov x24,x0
00a1ad3c	mov x22,x0
00a1ad40	cbz x0,0x00a1ad74
00a1ad44	add x5,sp,#0xc
00a1ad48	mov x0,x19
00a1ad4c	mov w1,w21
00a1ad50	mov x2,x22
00a1ad54	mov x3,x20
00a1ad58	mov w4,wzr
00a1ad5c	bl 0x00a1afa0
00a1ad60	cbz w0,0x00a1ad74
00a1ad64	ldr w8,[sp, #0xc]
00a1ad68	cmp w8,#0x3
00a1ad6c	cset w23,eq
00a1ad70	b 0x00a1ad78
00a1ad74	mov w23,#0xffffffff
00a1ad78	mov x0,x24
00a1ad7c	bl 0x00c38a30
00a1ad80	mov w0,w23
00a1ad84	ldp x29,x30,[sp, #0x50]
00a1ad88	ldp x20,x19,[sp, #0x40]
00a1ad8c	ldp x22,x21,[sp, #0x30]
00a1ad90	ldp x24,x23,[sp, #0x20]
00a1ad94	ldp x26,x25,[sp, #0x10]
00a1ad98	add sp,sp,#0x60
00a1ad9c	ret
