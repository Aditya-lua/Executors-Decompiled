; psa_aead_decrypt @ 00b8bb5c
00b8bb5c	sub sp,sp,#0xc0
00b8bb60	stp x28,x27,[sp, #0x60]
00b8bb64	stp x26,x25,[sp, #0x70]
00b8bb68	stp x24,x23,[sp, #0x80]
00b8bb6c	stp x22,x21,[sp, #0x90]
00b8bb70	stp x20,x19,[sp, #0xa0]
00b8bb74	stp x29,x30,[sp, #0xb0]
00b8bb78	add x29,sp,#0xb0
00b8bb7c	mrs x19,tpidr_el0
00b8bb80	ldr x28,[x29, #0x20]
00b8bb84	ldr x8,[x19, #0x28]
00b8bb88	and w9,w1,#0x7f000000
00b8bb8c	mov w10,#0x5000000
00b8bb90	mov x23,x7
00b8bb94	mov x26,x6
00b8bb98	mov x21,x5
00b8bb9c	mov x25,x4
00b8bba0	mov x22,x3
00b8bba4	mov x20,x2
00b8bba8	mov w24,w1
00b8bbac	cmp w9,w10
00b8bbb0	str x8,[sp, #0x58]
00b8bbb4	str xzr,[x28]
00b8bbb8	b.ne 0x00b8bc9c
00b8bbbc	mov w9,#0x8ff
00b8bbc0	and w8,w24,#0xffffff00
00b8bbc4	movk w9,#0x600, LSL #16
00b8bbc8	cmp w8,w9
00b8bbcc	b.gt 0x00b8bbe8
00b8bbd0	mov w9,#0x200
00b8bbd4	movk w9,#0x600, LSL #16
00b8bbd8	cmp w8,w9
00b8bbdc	b.eq 0x00b8bc1c
00b8bbe0	mov w9,#0x300
00b8bbe4	b 0x00b8bbfc
00b8bbe8	mov w9,#0x900
00b8bbec	movk w9,#0x600, LSL #16
00b8bbf0	cmp w8,w9
00b8bbf4	b.eq 0x00b8bc1c
00b8bbf8	mov w9,#0x1300
00b8bbfc	movk w9,#0x600, LSL #16
00b8bc00	cmp w8,w9
00b8bc04	b.eq 0x00b8bc1c
00b8bc08	lsr w9,w24,#0x9
00b8bc0c	orr w9,w9,#0x1
00b8bc10	orr w10,wzr,#0x30003
00b8bc14	cmp w9,w10
00b8bc18	b.ne 0x00b8bc4c
00b8bc1c	ands w9,w24,#0xff
00b8bc20	b.eq 0x00b8bc4c
00b8bc24	mov w10,#0x8ff
00b8bc28	movk w10,#0x600, LSL #16
00b8bc2c	cmp w8,w10
00b8bc30	b.gt 0x00b8bc54
00b8bc34	mov w10,#0x200
00b8bc38	movk w10,#0x600, LSL #16
00b8bc3c	cmp w8,w10
00b8bc40	b.eq 0x00b8bc88
00b8bc44	mov w10,#0x300
00b8bc48	b 0x00b8bc68
00b8bc4c	tbz w24,#0xf,0x00b8bcd4
00b8bc50	b 0x00b8bc9c
00b8bc54	mov w10,#0x900
00b8bc58	movk w10,#0x600, LSL #16
00b8bc5c	cmp w8,w10
00b8bc60	b.eq 0x00b8bc88
00b8bc64	mov w10,#0x1300
00b8bc68	movk w10,#0x600, LSL #16
00b8bc6c	cmp w8,w10
00b8bc70	b.eq 0x00b8bc88
00b8bc74	lsr w8,w24,#0x9
00b8bc78	orr w8,w8,#0x1
00b8bc7c	orr w10,wzr,#0x30003
00b8bc80	cmp w8,w10
00b8bc84	b.ne 0x00b8bcd4
00b8bc88	orr w8,w9,#0x2000000
00b8bc8c	mov w9,#0xff
00b8bc90	movk w9,#0x200, LSL #16
00b8bc94	cmp w8,w9
00b8bc98	b.ne 0x00b8bcd4
00b8bc9c	mov w27,#0xffffff79
00b8bca0	ldr x8,[x19, #0x28]
00b8bca4	ldr x9,[sp, #0x58]
00b8bca8	cmp x8,x9
00b8bcac	b.ne 0x00b8bf18
00b8bcb0	mov w0,w27
00b8bcb4	ldp x29,x30,[sp, #0xb0]
00b8bcb8	ldp x20,x19,[sp, #0xa0]
00b8bcbc	ldp x22,x21,[sp, #0x90]
00b8bcc0	ldp x24,x23,[sp, #0x80]
00b8bcc4	ldp x26,x25,[sp, #0x70]
00b8bcc8	ldp x28,x27,[sp, #0x60]
00b8bccc	add sp,sp,#0xc0
00b8bcd0	ret
00b8bcd4	add x1,sp,#0x50
00b8bcd8	mov w2,#0x200
00b8bcdc	mov w3,w24
00b8bce0	bl 0x00b86e5c
00b8bce4	mov w27,w0
00b8bce8	cbnz w0,0x00b8bca0
00b8bcec	cbz x22,0x00b8bd8c
00b8bcf0	mov w1,#0x1
00b8bcf4	mov x0,x22
00b8bcf8	bl 0x00c30a30
00b8bcfc	cbz x0,0x00b8bdf0
00b8bd00	mov x1,x20
00b8bd04	mov x2,x22
00b8bd08	str x0,[sp, #0x48]
00b8bd0c	bl 0x00c2ffd0
00b8bd10	cbz x21,0x00b8bd94
00b8bd14	mov w1,#0x1
00b8bd18	mov x0,x21
00b8bd1c	bl 0x00c30a30
00b8bd20	mov x20,x0
00b8bd24	cbz x0,0x00b8bdfc
00b8bd28	mov x0,x20
00b8bd2c	mov x1,x25
00b8bd30	mov x2,x21
00b8bd34	bl 0x00c2ffd0
00b8bd38	cbz x23,0x00b8bd9c
00b8bd3c	mov w1,#0x1
00b8bd40	mov x0,x23
00b8bd44	bl 0x00c30a30
00b8bd48	mov x25,x0
00b8bd4c	cbz x0,0x00b8be00
00b8bd50	mov x0,x25
00b8bd54	mov x1,x26
00b8bd58	mov x2,x23
00b8bd5c	str x20,[sp, #0x40]
00b8bd60	bl 0x00c2ffd0
00b8bd64	ldr x20,[x29, #0x18]
00b8bd68	cbz x20,0x00b8bdac
00b8bd6c	mov w1,#0x1
00b8bd70	mov x0,x20
00b8bd74	bl 0x00c30a30
00b8bd78	mov x26,x0
00b8bd7c	cbz x0,0x00b8be18
00b8bd80	ldr x8,[x29, #0x10]
00b8bd84	stp x8,x20,[sp, #0x30]
00b8bd88	b 0x00b8bdb4
00b8bd8c	str xzr,[sp, #0x48]
00b8bd90	cbnz x21,0x00b8bd14
00b8bd94	mov x20,xzr
00b8bd98	cbnz x23,0x00b8bd3c
00b8bd9c	str x20,[sp, #0x40]
00b8bda0	mov x25,xzr
00b8bda4	ldr x20,[x29, #0x18]
00b8bda8	cbnz x20,0x00b8bd6c
00b8bdac	stp xzr,xzr,[sp, #0x30]
00b8bdb0	mov x26,xzr
00b8bdb4	mov w9,#0x500
00b8bdb8	and w8,w24,#0xffc07fff
00b8bdbc	movk w9,#0x500, LSL #16
00b8bdc0	cmp w8,w9
00b8bdc4	b.eq 0x00b8be28
00b8bdc8	mov w9,#0x100
00b8bdcc	movk w9,#0x540, LSL #16
00b8bdd0	cmp w8,w9
00b8bdd4	b.eq 0x00b8be40
00b8bdd8	mov w9,#0x200
00b8bddc	movk w9,#0x540, LSL #16
00b8bde0	cmp w8,w9
00b8bde4	b.ne 0x00b8be90
00b8bde8	cbnz x22,0x00b8be4c
00b8bdec	b 0x00b8be98
00b8bdf0	mov x20,xzr
00b8bdf4	mov x25,xzr
00b8bdf8	b 0x00b8be04
00b8bdfc	mov x25,xzr
00b8be00	ldr x0,[sp, #0x48]
00b8be04	mov x21,xzr
00b8be08	mov x26,xzr
00b8be0c	mov x22,xzr
00b8be10	mov w27,#0xffffff73
00b8be14	b 0x00b8becc
00b8be18	mov x21,xzr
00b8be1c	mov x22,xzr
00b8be20	mov w27,#0xffffff73
00b8be24	b 0x00b8bec8
00b8be28	cmp x22,#0x8
00b8be2c	mov w8,#0xffffff79
00b8be30	cinc w27,w8,eq
00b8be34	cmp x22,#0xc
00b8be38	b.eq 0x00b8be4c
00b8be3c	b 0x00b8be9c
00b8be40	sub x8,x22,#0x7
00b8be44	cmp x8,#0x7
00b8be48	b.cs 0x00b8be98
00b8be4c	ldr x0,[sp, #0x50]
00b8be50	ldr w8,[x0, #0x4]
00b8be54	cmp w8,#0xff
00b8be58	b.hi 0x00b8bea8
00b8be5c	ldp x1,x2,[x0, #0x28]
00b8be60	ldp x6,x4,[sp, #0x40]
00b8be64	mov w3,w24
00b8be68	mov x5,x22
00b8be6c	mov x7,x21
00b8be70	stp x20,x28,[sp, #0x18]
00b8be74	stp x23,x26,[sp, #0x8]
00b8be78	str x25,[sp]
00b8be7c	bl 0x00c42dc0
00b8be80	mov w27,w0
00b8be84	ldp x22,x21,[sp, #0x30]
00b8be88	cbnz x20,0x00b8beb4
00b8be8c	b 0x00b8bec8
00b8be90	mov w27,#0xffffff7a
00b8be94	b 0x00b8be9c
00b8be98	mov w27,#0xffffff79
00b8be9c	ldp x20,x0,[sp, #0x40]
00b8bea0	ldp x22,x21,[sp, #0x30]
00b8bea4	b 0x00b8becc
00b8bea8	mov w27,#0xffffff79
00b8beac	ldp x22,x21,[sp, #0x30]
00b8beb0	cbz x20,0x00b8bec8
00b8beb4	cbz w27,0x00b8bec8
00b8beb8	mov x0,x26
00b8bebc	mov w1,wzr
00b8bec0	mov x2,x20
00b8bec4	bl 0x00c301c0
00b8bec8	ldp x20,x0,[sp, #0x40]
00b8becc	bl 0x00c30960
00b8bed0	mov x0,x20
00b8bed4	bl 0x00c30960
00b8bed8	mov x0,x25
00b8bedc	bl 0x00c30960
00b8bee0	cbz x26,0x00b8bf0c
00b8bee4	cbz x22,0x00b8bf08
00b8bee8	cbz x21,0x00b8befc
00b8beec	mov x0,x22
00b8bef0	mov x1,x26
00b8bef4	mov x2,x21
00b8bef8	bl 0x00c2ffd0
00b8befc	mov x0,x26
00b8bf00	bl 0x00c30960
00b8bf04	b 0x00b8bf0c
00b8bf08	mov w27,#0xffffff69
00b8bf0c	ldr x0,[sp, #0x50]
00b8bf10	bl 0x00c431e0
00b8bf14	b 0x00b8bca0
00b8bf18	bl 0x00c2fec0
