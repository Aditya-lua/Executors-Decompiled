; FUN_0091a944 @ 0091a944
0091a944	sub sp,sp,#0xa0
0091a948	stp x28,x27,[sp, #0x40]
0091a94c	stp x26,x25,[sp, #0x50]
0091a950	stp x24,x23,[sp, #0x60]
0091a954	stp x22,x21,[sp, #0x70]
0091a958	stp x20,x19,[sp, #0x80]
0091a95c	stp x29,x30,[sp, #0x90]
0091a960	add x29,sp,#0x90
0091a964	str x2,[sp, #0x20]
0091a968	mrs x8,tpidr_el0
0091a96c	str x8,[sp, #0x8]
0091a970	ldr x8,[x8, #0x28]
0091a974	mov x20,x0
0091a978	str x8,[sp, #0x38]
0091a97c	ldr x8,[x0, #0x20]
0091a980	str x8,[sp, #0x10]
0091a984	tbz w1,#0x0,0x0091a998
0091a988	ldrb w8,[x20, #0xa82]
0091a98c	tbnz w8,#0x3,0x0091a9cc
0091a990	ldr x8,[x20, #0x340]
0091a994	b 0x0091a9d0
0091a998	ldr x8,[x8, #0x3a0]
0091a99c	ldr x9,[x20, #0x340]
0091a9a0	mov w10,#0x9
0091a9a4	and x8,x8,x10
0091a9a8	cmp x8,#0x1
0091a9ac	str x9,[sp, #0x28]
0091a9b0	b.ne 0x0091a9d4
0091a9b4	ldrb w8,[x20, #0xa82]
0091a9b8	tbz w8,#0x3,0x0091a9d4
0091a9bc	ldr x8,[x20, #0x6c0]
0091a9c0	str x8,[sp, #0x30]
0091a9c4	mov w8,#0x2
0091a9c8	b 0x0091a9d8
0091a9cc	ldr x8,[x20, #0x6c0]
0091a9d0	str x8,[sp, #0x28]
0091a9d4	mov w8,#0x1
0091a9d8	str x8,[sp, #0x18]
0091a9dc	mov w8,#0x131a
0091a9e0	adrp x22,0x2ab000
0091a9e4	mov x23,xzr
0091a9e8	add x24,x20,#0x1b1
0091a9ec	add x22,x22,#0x32c
0091a9f0	add x19,x20,x8
0091a9f4	add x8,sp,#0x28
0091a9f8	ldr x21,[x8, x23, LSL #0x3]
0091a9fc	cbnz x21,0x0091aa58
0091aa00	b 0x0091ac24
0091aa04	cmp x26,#0x7
0091aa08	b.eq 0x0091aa30
0091aa0c	cmp x26,#0xe
0091aa10	b.ne 0x0091ac00
0091aa14	adrp x1,0x29f000
0091aa18	orr w2,wzr,#0xe
0091aa1c	mov x0,x28
0091aa20	add x1,x1,#0x496
0091aa24	bl 0x00c31b50
0091aa28	cbnz w0,0x0091aa48
0091aa2c	b 0x0091ac00
0091aa30	adrp x1,0x2c4000
0091aa34	orr w2,wzr,#0x7
0091aa38	mov x0,x28
0091aa3c	add x1,x1,#0xf28
0091aa40	bl 0x00c31b50
0091aa44	cbz w0,0x0091ac00
0091aa48	mov x0,x20
0091aa4c	bl 0x0096795c
0091aa50	tbnz w0,#0x0,0x0091ac00
0091aa54	b 0x0091ac1c
0091aa58	ldr x28,[x21]
0091aa5c	mov w1,#0x3a
0091aa60	mov x0,x28
0091aa64	bl 0x00c30890
0091aa68	cbz x0,0x0091aadc
0091aa6c	sub x26,x0,x28
0091aa70	add x27,x0,#0x1
0091aa74	b 0x0091aa7c
0091aa78	add x27,x27,#0x1
0091aa7c	ldrb w8,[x27]
0091aa80	cmp w8,#0x9
0091aa84	b.eq 0x0091aa78
0091aa88	cmp w8,#0x20
0091aa8c	b.eq 0x0091aa78
0091aa90	cbz w8,0x0091ac1c
0091aa94	sub w9,w8,#0xa
0091aa98	cmp w9,#0x4
0091aa9c	b.cc 0x0091aa78
0091aaa0	cbz w8,0x0091ac1c
0091aaa4	mov x0,x27
0091aaa8	bl 0x00c2ff50
0091aaac	mov x25,x0
0091aab0	cmp x26,#0x5
0091aab4	b.ne 0x0091ab34
0091aab8	ldr x8,[x20, #0x12d0]
0091aabc	cbz x8,0x0091ab34
0091aac0	adrp x1,0x2bc000
0091aac4	mov w2,#0x5
0091aac8	mov x0,x28
0091aacc	add x1,x1,#0xe63
0091aad0	bl 0x00c31b50
0091aad4	cbnz w0,0x0091ac1c
0091aad8	b 0x0091ab34
0091aadc	mov w1,#0x3b
0091aae0	mov x0,x28
0091aae4	bl 0x00c30890
0091aae8	cbz x0,0x0091ac1c
0091aaec	sub x26,x0,x28
0091aaf0	add x8,x0,#0x1
0091aaf4	b 0x0091aafc
0091aaf8	add x8,x8,#0x1
0091aafc	ldrb w9,[x8]
0091ab00	cmp w9,#0x9
0091ab04	b.eq 0x0091aaf8
0091ab08	cmp w9,#0x20
0091ab0c	b.eq 0x0091aaf8
0091ab10	cbz w9,0x0091ab24
0091ab14	sub w10,w9,#0xa
0091ab18	cmp w10,#0x4
0091ab1c	b.cc 0x0091aaf8
0091ab20	cbnz w9,0x0091ac1c
0091ab24	mov x25,xzr
0091ab28	mov x27,x22
0091ab2c	cmp x26,#0x5
0091ab30	b.eq 0x0091aab8
0091ab34	ldrb w8,[x19]
0091ab38	cmp w8,#0x2
0091ab3c	b.ne 0x0091ab64
0091ab40	cmp x26,#0xd
0091ab44	b.ne 0x0091ab88
0091ab48	adrp x1,0x2d2000
0091ab4c	mov w2,#0xd
0091ab50	mov x0,x28
0091ab54	add x1,x1,#0xeee
0091ab58	bl 0x00c31b50
0091ab5c	cbnz w0,0x0091ac1c
0091ab60	ldrb w8,[x19]
0091ab64	cmp x26,#0xd
0091ab68	b.ne 0x0091ab88
0091ab6c	cmp w8,#0x3
0091ab70	b.ne 0x0091ab88
0091ab74	adrp x1,0x2d2000
0091ab78	mov w2,#0xd
0091ab7c	mov x0,x28
0091ab80	add x1,x1,#0xeee
0091ab84	b 0x0091abf8
0091ab88	cmp x26,#0xf
0091ab8c	b.ne 0x0091abac
0091ab90	ldr w8,[x24]
0091ab94	tbz w8,#0x10,0x0091abac
0091ab98	adrp x1,0x29d000
0091ab9c	orr w2,wzr,#0xf
0091aba0	mov x0,x28
0091aba4	add x1,x1,#0x650
0091aba8	b 0x0091abf8
0091abac	cmp x26,#0xb
0091abb0	b.ne 0x0091abd0
0091abb4	ldr x8,[x20, #0x12e8]
0091abb8	cbz x8,0x0091abd0
0091abbc	adrp x1,0x2b9000
0091abc0	mov w2,#0xb
0091abc4	mov x0,x28
0091abc8	add x1,x1,#0xa0
0091abcc	b 0x0091abf8
0091abd0	cmp x26,#0x12
0091abd4	b.ne 0x0091aa04
0091abd8	ldr x8,[sp, #0x10]
0091abdc	ldrb w8,[x8, #0x574]
0091abe0	cmp w8,#0x14
0091abe4	b.cc 0x0091aa04
0091abe8	adrp x1,0x2a7000
0091abec	mov w2,#0x12
0091abf0	mov x0,x28
0091abf4	add x1,x1,#0x25c
0091abf8	bl 0x00c31b50
0091abfc	cbnz w0,0x0091ac1c
0091ac00	ldr x0,[sp, #0x20]
0091ac04	mov x1,x28
0091ac08	mov x2,x26
0091ac0c	mov x3,x27
0091ac10	mov x4,x25
0091ac14	bl 0x0091fe64
0091ac18	cbnz w0,0x0091ac38
0091ac1c	ldr x21,[x21, #0x8]
0091ac20	cbnz x21,0x0091aa58
0091ac24	ldr x8,[sp, #0x18]
0091ac28	add x23,x23,#0x1
0091ac2c	cmp x23,x8
0091ac30	b.cc 0x0091a9f4
0091ac34	mov w0,wzr
0091ac38	ldr x8,[sp, #0x8]
0091ac3c	ldr x8,[x8, #0x28]
0091ac40	ldr x9,[sp, #0x38]
0091ac44	cmp x8,x9
0091ac48	b.ne 0x0091ac6c
0091ac4c	ldp x29,x30,[sp, #0x90]
0091ac50	ldp x20,x19,[sp, #0x80]
0091ac54	ldp x22,x21,[sp, #0x70]
0091ac58	ldp x24,x23,[sp, #0x60]
0091ac5c	ldp x26,x25,[sp, #0x50]
0091ac60	ldp x28,x27,[sp, #0x40]
0091ac64	add sp,sp,#0xa0
0091ac68	ret
0091ac6c	bl 0x00c2fec0
