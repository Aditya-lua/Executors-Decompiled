; FUN_00a7ba84 @ 00a7ba84
00a7ba84	sub sp,sp,#0x70
00a7ba88	stp x28,x27,[sp, #0x10]
00a7ba8c	stp x26,x25,[sp, #0x20]
00a7ba90	stp x24,x23,[sp, #0x30]
00a7ba94	stp x22,x21,[sp, #0x40]
00a7ba98	stp x20,x19,[sp, #0x50]
00a7ba9c	stp x29,x30,[sp, #0x60]
00a7baa0	add x29,sp,#0x60
00a7baa4	str xzr,[sp, #0x8]
00a7baa8	cbz x0,0x00a7bb18
00a7baac	mov w20,w1
00a7bab0	mov x19,x0
00a7bab4	str x2,[sp]
00a7bab8	bl 0x00c3bfb0
00a7babc	str w20,[x19]
00a7bac0	bl 0x00c35250
00a7bac4	ldr x0,[x19, #0x20]
00a7bac8	cbz x0,0x00a7be30
00a7bacc	ldr x8,[x19, #0x88]
00a7bad0	cbz x8,0x00a7bb50
00a7bad4	ldr x8,[x8, #0x60]
00a7bad8	cbz x8,0x00a7bb7c
00a7badc	cmp x8,x0
00a7bae0	b.eq 0x00a7bb7c
00a7bae4	bl 0x00c35ed0
00a7bae8	bl 0x00c342a0
00a7baec	adrp x0,0x2d1000
00a7baf0	adrp x2,0x2d9000
00a7baf4	add x0,x0,#0xaf6
00a7baf8	add x2,x2,#0xd78
00a7bafc	mov w1,#0x1ae
00a7bb00	bl 0x00c342b0
00a7bb04	mov w8,#0x102
00a7bb08	movk w8,#0xc, LSL #16
00a7bb0c	add w1,w8,#0x1
00a7bb10	orr w0,wzr,#0x6
00a7bb14	b 0x00a7bf20
00a7bb18	bl 0x00c342a0
00a7bb1c	adrp x0,0x2d1000
00a7bb20	adrp x2,0x2d9000
00a7bb24	add x0,x0,#0xaf6
00a7bb28	add x2,x2,#0xd78
00a7bb2c	mov w1,#0x196
00a7bb30	bl 0x00c342b0
00a7bb34	mov w1,#0x102
00a7bb38	orr w0,wzr,#0x6
00a7bb3c	movk w1,#0xc, LSL #16
00a7bb40	mov x2,xzr
00a7bb44	bl 0x00c342c0
00a7bb48	mov w20,#0xffffffff
00a7bb4c	b 0x00a7bf40
00a7bb50	bl 0x00c35ed0
00a7bb54	bl 0x00c342a0
00a7bb58	adrp x0,0x2d1000
00a7bb5c	adrp x2,0x2d9000
00a7bb60	add x0,x0,#0xaf6
00a7bb64	add x2,x2,#0xd78
00a7bb68	mov w1,#0x1a4
00a7bb6c	bl 0x00c342b0
00a7bb70	orr w0,wzr,#0x6
00a7bb74	mov w1,#0x9a
00a7bb78	b 0x00a7bf20
00a7bb7c	orr w1,wzr,#0xc
00a7bb80	bl 0x00c3bf90
00a7bb84	cbz x0,0x00a7bd90
00a7bb88	mov x23,x0
00a7bb8c	mov x27,xzr
00a7bb90	mov x22,xzr
00a7bb94	mov x21,xzr
00a7bb98	mov x24,xzr
00a7bb9c	mov w28,#0x1
00a7bba0	cbz x22,0x00a7bc04
00a7bba4	add x9,x22,#0x20
00a7bba8	ldxr w8,[x9]
00a7bbac	subs w10,w8,#0x1
00a7bbb0	stxr w11,w10,[x9]
00a7bbb4	cbnz w11,0x00a7bba8
00a7bbb8	b.ne 0x00a7bbc4
00a7bbbc	dmb ISHLD
00a7bbc0	b 0x00a7bbcc
00a7bbc4	cmp w8,#0x1
00a7bbc8	b.gt 0x00a7bc04
00a7bbcc	ldr x0,[x22, #0x8]
00a7bbd0	adrp x25,0x2d1000
00a7bbd4	add x25,x25,#0xaf6
00a7bbd8	mov w2,#0x121
00a7bbdc	mov x1,x25
00a7bbe0	bl 0x00c32310
00a7bbe4	ldr x0,[x22, #0x18]
00a7bbe8	bl 0x00c3b690
00a7bbec	ldr x0,[x22, #0x28]
00a7bbf0	bl 0x00c34d40
00a7bbf4	mov w2,#0x124
00a7bbf8	mov x0,x21
00a7bbfc	mov x1,x25
00a7bc00	bl 0x00c32310
00a7bc04	ldr x0,[sp, #0x8]
00a7bc08	bl 0x00c36350
00a7bc0c	and w8,w28,#0x7fffffff
00a7bc10	cmp w8,#0x2
00a7bc14	b.eq 0x00a7bc58
00a7bc18	cmp w8,#0x1
00a7bc1c	b.ne 0x00a7bca0
00a7bc20	adrp x5,0xcb5000
00a7bc24	adrp x6,0xcb5000
00a7bc28	ldp x0,x3,[x19, #0x8]
00a7bc2c	ldr x5,[x5, #0x648]
00a7bc30	ldr x6,[x6, #0x178]
00a7bc34	adrp x4,0xa7b000
00a7bc38	orr w1,wzr,#0xc
00a7bc3c	mov x2,x23
00a7bc40	add x4,x4,#0x364
00a7bc44	bl 0x00c3bf50
00a7bc48	mov x24,x0
00a7bc4c	cbz x0,0x00a7bd08
00a7bc50	ldr x27,[x24, #0x18]
00a7bc54	b 0x00a7bc94
00a7bc58	ldr x0,[x19, #0x20]
00a7bc5c	bl 0x00c36360
00a7bc60	adrp x5,0xcb5000
00a7bc64	adrp x6,0xcb5000
00a7bc68	ldr x3,[x19, #0x10]
00a7bc6c	ldr x5,[x5, #0x648]
00a7bc70	ldr x6,[x6, #0x178]
00a7bc74	adrp x4,0xa7b000
00a7bc78	orr w1,wzr,#0xc
00a7bc7c	mov x2,x23
00a7bc80	add x4,x4,#0x364
00a7bc84	mov x27,x0
00a7bc88	bl 0x00c3bf60
00a7bc8c	cbz x0,0x00a7be30
00a7bc90	mov x24,x0
00a7bc94	mov x21,x24
00a7bc98	mov x22,x24
00a7bc9c	b 0x00a7bca4
00a7bca0	cbz x22,0x00a7bd1c
00a7bca4	ldr x0,[x19, #0x20]
00a7bca8	bl 0x00c3bf30
00a7bcac	ldr x2,[x19, #0x10]
00a7bcb0	mov x1,x0
00a7bcb4	mov x0,x27
00a7bcb8	bl 0x00c3bf80
00a7bcbc	mov x26,x0
00a7bcc0	str x0,[sp, #0x8]
00a7bcc4	cbz x0,0x00a7bce8
00a7bcc8	ldr x0,[x19, #0x88]
00a7bccc	ldp x1,x3,[x19, #0x8]
00a7bcd0	add x2,sp,#0x8
00a7bcd4	bl 0x00c3bfc0
00a7bcd8	ldr x8,[sp, #0x8]
00a7bcdc	mov x25,x0
00a7bce0	cbnz x8,0x00a7bcf4
00a7bce4	b 0x00a7bcec
00a7bce8	mov x25,xzr
00a7bcec	mov x0,x26
00a7bcf0	bl 0x00c36350
00a7bcf4	cbnz x25,0x00a7bd2c
00a7bcf8	add w28,w28,#0x1
00a7bcfc	cmp w28,#0x3
00a7bd00	b.cc 0x00a7bba0
00a7bd04	b 0x00a7bd2c
00a7bd08	mov x25,xzr
00a7bd0c	mov x21,xzr
00a7bd10	mov x22,xzr
00a7bd14	cbz x25,0x00a7bcf8
00a7bd18	b 0x00a7bd2c
00a7bd1c	mov x25,xzr
00a7bd20	mov x24,xzr
00a7bd24	mov x21,xzr
00a7bd28	cbz x25,0x00a7bcf8
00a7bd2c	cbz x25,0x00a7bdb0
00a7bd30	bl 0x00c35240
00a7bd34	str x24,[x19, #0x28]
00a7bd38	ldr x0,[x22, #0x18]
00a7bd3c	ldr x21,[x22, #0x30]
00a7bd40	bl 0x00c3b680
00a7bd44	ldr x1,[x19, #0x10]
00a7bd48	blr x21
00a7bd4c	str x0,[x19, #0x30]
00a7bd50	cbz x0,0x00a7bdd4
00a7bd54	cmp w20,#0x40
00a7bd58	b.eq 0x00a7bf64
00a7bd5c	cmp w20,#0x20
00a7bd60	b.eq 0x00a7bf88
00a7bd64	cmp w20,#0x10
00a7bd68	b.ne 0x00a7bfbc
00a7bd6c	ldr x8,[x22, #0x38]
00a7bd70	cbnz x8,0x00a7bf90
00a7bd74	bl 0x00c342a0
00a7bd78	adrp x0,0x2d1000
00a7bd7c	adrp x2,0x2d9000
00a7bd80	add x0,x0,#0xaf6
00a7bd84	add x2,x2,#0xd78
00a7bd88	mov w1,#0x212
00a7bd8c	b 0x00a7bff0
00a7bd90	bl 0x00c35ed0
00a7bd94	bl 0x00c342a0
00a7bd98	adrp x0,0x2d1000
00a7bd9c	adrp x2,0x2d9000
00a7bda0	add x0,x0,#0xaf6
00a7bda4	add x2,x2,#0xd78
00a7bda8	mov w1,#0x1b5
00a7bdac	b 0x00a7bf14
00a7bdb0	cbz x22,0x00a7be30
00a7bdb4	add x9,x22,#0x20
00a7bdb8	ldxr w8,[x9]
00a7bdbc	subs w10,w8,#0x1
00a7bdc0	stxr w11,w10,[x9]
00a7bdc4	cbnz w11,0x00a7bdb8
00a7bdc8	b.ne 0x00a7bdf0
00a7bdcc	dmb ISHLD
00a7bdd0	b 0x00a7bdf8
00a7bdd4	bl 0x00c342a0
00a7bdd8	adrp x0,0x2d1000
00a7bddc	adrp x2,0x2d9000
00a7bde0	add x0,x0,#0xaf6
00a7bde4	add x2,x2,#0xd78
00a7bde8	mov w1,#0x20b
00a7bdec	b 0x00a7bf14
00a7bdf0	cmp w8,#0x1
00a7bdf4	b.gt 0x00a7be30
00a7bdf8	ldr x0,[x22, #0x8]
00a7bdfc	adrp x21,0x2d1000
00a7be00	add x21,x21,#0xaf6
00a7be04	mov w2,#0x121
00a7be08	mov x1,x21
00a7be0c	bl 0x00c32310
00a7be10	ldr x0,[x22, #0x18]
00a7be14	bl 0x00c3b690
00a7be18	ldr x0,[x22, #0x28]
00a7be1c	bl 0x00c34d40
00a7be20	mov w2,#0x124
00a7be24	mov x0,x24
00a7be28	mov x1,x21
00a7be2c	bl 0x00c32310
00a7be30	bl 0x00c35240
00a7be34	ldr x0,[sp, #0x8]
00a7be38	bl 0x00c36350
00a7be3c	str xzr,[sp, #0x8]
00a7be40	ldr x8,[x19, #0x78]
00a7be44	cbz x8,0x00a7bec8
00a7be48	cmp w20,#0x40
00a7be4c	b.eq 0x00a7be78
00a7be50	cmp w20,#0x20
00a7be54	b.eq 0x00a7be8c
00a7be58	cmp w20,#0x10
00a7be5c	b.ne 0x00a7befc
00a7be60	ldr x9,[x8, #0x48]
00a7be64	cbz x9,0x00a7bec8
00a7be68	ldr x8,[x8, #0x40]
00a7be6c	cbnz x8,0x00a7be9c
00a7be70	mov w20,#0x1
00a7be74	b 0x00a7bf40
00a7be78	ldr x9,[x8, #0x68]
00a7be7c	cbz x9,0x00a7bec8
00a7be80	ldr x8,[x8, #0x60]
00a7be84	cbnz x8,0x00a7be9c
00a7be88	b 0x00a7be70
00a7be8c	ldr x9,[x8, #0x58]
00a7be90	cbz x9,0x00a7bec8
00a7be94	ldr x8,[x8, #0x50]
00a7be98	cbz x8,0x00a7be70
00a7be9c	mov x0,x19
00a7bea0	blr x8
00a7bea4	mov w20,w0
00a7bea8	cmp w0,#0x1
00a7beac	b.lt 0x00a7bf2c
00a7beb0	mov x0,x19
00a7beb4	bl 0x00c3d760
00a7beb8	ldr x8,[sp, #0x8]
00a7bebc	mov w20,w0
00a7bec0	mov x0,x8
00a7bec4	b 0x00a7bf3c
00a7bec8	bl 0x00c342a0
00a7becc	adrp x0,0x2d1000
00a7bed0	adrp x2,0x2d9000
00a7bed4	add x0,x0,#0xaf6
00a7bed8	add x2,x2,#0xd78
00a7bedc	mov w1,#0x243
00a7bee0	bl 0x00c342b0
00a7bee4	orr w0,wzr,#0x6
00a7bee8	mov w1,#0x96
00a7beec	mov x2,xzr
00a7bef0	bl 0x00c342c0
00a7bef4	orr w20,wzr,#0xfffffffe
00a7bef8	b 0x00a7bf40
00a7befc	bl 0x00c342a0
00a7bf00	adrp x0,0x2d1000
00a7bf04	adrp x2,0x2d9000
00a7bf08	add x0,x0,#0xaf6
00a7bf0c	add x2,x2,#0xd78
00a7bf10	mov w1,#0x258
00a7bf14	bl 0x00c342b0
00a7bf18	orr w0,wzr,#0x6
00a7bf1c	mov w1,#0x86
00a7bf20	mov x2,xzr
00a7bf24	bl 0x00c342c0
00a7bf28	mov w20,wzr
00a7bf2c	mov x0,x19
00a7bf30	bl 0x00c3bfb0
00a7bf34	str wzr,[x19]
00a7bf38	ldr x0,[sp, #0x8]
00a7bf3c	bl 0x00c36350
00a7bf40	mov w0,w20
00a7bf44	ldp x29,x30,[sp, #0x60]
00a7bf48	ldp x20,x19,[sp, #0x50]
00a7bf4c	ldp x22,x21,[sp, #0x40]
00a7bf50	ldp x24,x23,[sp, #0x30]
00a7bf54	ldp x26,x25,[sp, #0x20]
00a7bf58	ldp x28,x27,[sp, #0x10]
00a7bf5c	add sp,sp,#0x70
00a7bf60	ret
00a7bf64	ldr x8,[x22, #0x58]
00a7bf68	cbnz x8,0x00a7bf90
00a7bf6c	bl 0x00c342a0
00a7bf70	adrp x0,0x2d1000
00a7bf74	adrp x2,0x2d9000
00a7bf78	add x0,x0,#0xaf6
00a7bf7c	add x2,x2,#0xd78
00a7bf80	mov w1,#0x222
00a7bf84	b 0x00a7bff0
00a7bf88	ldr x8,[x22, #0x48]
00a7bf8c	cbz x8,0x00a7bfd8
00a7bf90	ldr x2,[sp]
00a7bf94	mov x1,x25
00a7bf98	blr x8
00a7bf9c	mov w20,w0
00a7bfa0	cmp w0,#0x0
00a7bfa4	b.gt 0x00a7beb0
00a7bfa8	ldr x8,[x22, #0xa8]
00a7bfac	ldr x0,[x19, #0x30]
00a7bfb0	blr x8
00a7bfb4	str xzr,[x19, #0x30]
00a7bfb8	b 0x00a7bf2c
00a7bfbc	bl 0x00c342a0
00a7bfc0	adrp x0,0x2d1000
00a7bfc4	adrp x2,0x2d9000
00a7bfc8	add x0,x0,#0xaf6
00a7bfcc	add x2,x2,#0xd78
00a7bfd0	mov w1,#0x22a
00a7bfd4	b 0x00a7bf14
00a7bfd8	bl 0x00c342a0
00a7bfdc	adrp x0,0x2d1000
00a7bfe0	adrp x2,0x2d9000
00a7bfe4	add x0,x0,#0xaf6
00a7bfe8	add x2,x2,#0xd78
00a7bfec	mov w1,#0x21a
00a7bff0	bl 0x00c342b0
00a7bff4	orr w0,wzr,#0x6
00a7bff8	mov w1,#0x96
00a7bffc	mov x2,xzr
00a7c000	bl 0x00c342c0
00a7c004	orr w20,wzr,#0xfffffffe
00a7c008	b 0x00a7bf2c
