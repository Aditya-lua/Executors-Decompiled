; ossl_ec_GFp_simple_ladder_step @ 00a3b9ec
00a3b9ec	sub sp,sp,#0x70
00a3b9f0	stp x20,x19,[sp, #0x50]
00a3b9f4	mov x20,x0
00a3b9f8	mov x0,x4
00a3b9fc	stp x28,x27,[sp, #0x10]
00a3ba00	stp x26,x25,[sp, #0x20]
00a3ba04	stp x24,x23,[sp, #0x30]
00a3ba08	stp x22,x21,[sp, #0x40]
00a3ba0c	stp x29,x30,[sp, #0x60]
00a3ba10	add x29,sp,#0x60
00a3ba14	mov x19,x4
00a3ba18	mov x25,x3
00a3ba1c	mov x22,x2
00a3ba20	mov x21,x1
00a3ba24	bl 0x00c38a90
00a3ba28	mov x0,x19
00a3ba2c	bl 0x00c38a40
00a3ba30	mov x26,x0
00a3ba34	mov x0,x19
00a3ba38	bl 0x00c38a40
00a3ba3c	str x0,[sp]
00a3ba40	mov x0,x19
00a3ba44	bl 0x00c38a40
00a3ba48	str x0,[sp, #0x8]
00a3ba4c	mov x0,x19
00a3ba50	bl 0x00c38a40
00a3ba54	mov x24,x0
00a3ba58	mov x0,x19
00a3ba5c	bl 0x00c38a40
00a3ba60	mov x23,x0
00a3ba64	mov x0,x19
00a3ba68	bl 0x00c38a40
00a3ba6c	mov x27,x0
00a3ba70	mov x0,x19
00a3ba74	bl 0x00c38a40
00a3ba78	cbz x0,0x00a3be9c
00a3ba7c	ldr x8,[x20]
00a3ba80	ldr x2,[x21, #0x10]
00a3ba84	ldr x3,[x22, #0x10]
00a3ba88	mov x28,x0
00a3ba8c	ldr x8,[x8, #0xf8]
00a3ba90	mov x0,x20
00a3ba94	mov x1,x28
00a3ba98	mov x4,x19
00a3ba9c	blr x8
00a3baa0	cbz w0,0x00a3be9c
00a3baa4	ldr x8,[x20]
00a3baa8	ldr x2,[x21, #0x20]
00a3baac	ldr x3,[x22, #0x20]
00a3bab0	mov x0,x20
00a3bab4	ldr x8,[x8, #0xf8]
00a3bab8	mov x1,x26
00a3babc	mov x4,x19
00a3bac0	blr x8
00a3bac4	cbz w0,0x00a3be9c
00a3bac8	ldr x8,[x20]
00a3bacc	ldr x2,[x21, #0x10]
00a3bad0	ldr x3,[x22, #0x20]
00a3bad4	mov x0,x20
00a3bad8	ldr x8,[x8, #0xf8]
00a3badc	mov x1,x23
00a3bae0	mov x4,x19
00a3bae4	blr x8
00a3bae8	cbz w0,0x00a3be9c
00a3baec	ldr x8,[x20]
00a3baf0	ldr x2,[x21, #0x20]
00a3baf4	ldr x3,[x22, #0x10]
00a3baf8	mov x0,x20
00a3bafc	ldr x8,[x8, #0xf8]
00a3bb00	mov x1,x24
00a3bb04	mov x4,x19
00a3bb08	blr x8
00a3bb0c	cbz w0,0x00a3be9c
00a3bb10	ldr x8,[x20]
00a3bb14	ldr x2,[x20, #0x60]
00a3bb18	mov x0,x20
00a3bb1c	mov x1,x27
00a3bb20	ldr x8,[x8, #0xf8]
00a3bb24	mov x3,x26
00a3bb28	mov x4,x19
00a3bb2c	blr x8
00a3bb30	cbz w0,0x00a3be9c
00a3bb34	ldr x3,[x20, #0x40]
00a3bb38	mov x0,x27
00a3bb3c	mov x1,x28
00a3bb40	mov x2,x27
00a3bb44	bl 0x00c38ec0
00a3bb48	cbz w0,0x00a3be9c
00a3bb4c	ldr x3,[x20, #0x40]
00a3bb50	mov x0,x28
00a3bb54	mov x1,x24
00a3bb58	mov x2,x23
00a3bb5c	bl 0x00c38ec0
00a3bb60	cbz w0,0x00a3be9c
00a3bb64	ldr x8,[x20]
00a3bb68	mov x0,x20
00a3bb6c	mov x1,x27
00a3bb70	mov x2,x28
00a3bb74	ldr x8,[x8, #0xf8]
00a3bb78	mov x3,x27
00a3bb7c	mov x4,x19
00a3bb80	blr x8
00a3bb84	cbz w0,0x00a3be9c
00a3bb88	ldr x8,[x20]
00a3bb8c	mov x0,x20
00a3bb90	mov x1,x26
00a3bb94	mov x2,x26
00a3bb98	ldr x8,[x8, #0x100]
00a3bb9c	mov x3,x19
00a3bba0	blr x8
00a3bba4	cbz w0,0x00a3be9c
00a3bba8	ldr x1,[x20, #0x68]
00a3bbac	ldr x3,[x20, #0x40]
00a3bbb0	ldr x0,[sp, #0x8]
00a3bbb4	mov w2,#0x2
00a3bbb8	bl 0x00c38ee0
00a3bbbc	cbz w0,0x00a3be9c
00a3bbc0	ldr x8,[x20]
00a3bbc4	ldr x2,[sp, #0x8]
00a3bbc8	mov x0,x20
00a3bbcc	mov x1,x26
00a3bbd0	ldr x8,[x8, #0xf8]
00a3bbd4	mov x3,x26
00a3bbd8	mov x4,x19
00a3bbdc	blr x8
00a3bbe0	cbz w0,0x00a3be9c
00a3bbe4	ldr x2,[x20, #0x40]
00a3bbe8	mov x0,x27
00a3bbec	mov x1,x27
00a3bbf0	bl 0x00c38ed0
00a3bbf4	cbz w0,0x00a3be9c
00a3bbf8	ldr x3,[x20, #0x40]
00a3bbfc	mov x0,x24
00a3bc00	mov x1,x23
00a3bc04	mov x2,x24
00a3bc08	bl 0x00c38f20
00a3bc0c	cbz w0,0x00a3be9c
00a3bc10	ldr x8,[x20]
00a3bc14	ldr x1,[x22, #0x20]
00a3bc18	mov x0,x20
00a3bc1c	mov x2,x24
00a3bc20	ldr x8,[x8, #0x100]
00a3bc24	mov x3,x19
00a3bc28	blr x8
00a3bc2c	cbz w0,0x00a3be9c
00a3bc30	ldr x8,[x20]
00a3bc34	ldr x2,[x22, #0x20]
00a3bc38	ldr x3,[x25, #0x10]
00a3bc3c	mov x0,x20
00a3bc40	ldr x8,[x8, #0xf8]
00a3bc44	mov x1,x23
00a3bc48	mov x4,x19
00a3bc4c	blr x8
00a3bc50	cbz w0,0x00a3be9c
00a3bc54	ldr x3,[x20, #0x40]
00a3bc58	mov x0,x26
00a3bc5c	mov x1,x26
00a3bc60	mov x2,x27
00a3bc64	bl 0x00c38ec0
00a3bc68	cbz w0,0x00a3be9c
00a3bc6c	ldr x0,[x22, #0x10]
00a3bc70	ldr x3,[x20, #0x40]
00a3bc74	mov x1,x26
00a3bc78	mov x2,x23
00a3bc7c	bl 0x00c38f20
00a3bc80	cbz w0,0x00a3be9c
00a3bc84	ldr x8,[x20]
00a3bc88	ldr x2,[x21, #0x10]
00a3bc8c	mov x0,x20
00a3bc90	mov x1,x23
00a3bc94	ldr x8,[x8, #0x100]
00a3bc98	mov x3,x19
00a3bc9c	blr x8
00a3bca0	cbz w0,0x00a3be9c
00a3bca4	ldr x8,[x20]
00a3bca8	ldr x2,[x21, #0x20]
00a3bcac	mov x0,x20
00a3bcb0	mov x1,x27
00a3bcb4	ldr x8,[x8, #0x100]
00a3bcb8	mov x3,x19
00a3bcbc	blr x8
00a3bcc0	cbz w0,0x00a3be9c
00a3bcc4	ldr x8,[x20]
00a3bcc8	ldr x3,[x20, #0x60]
00a3bccc	mov x0,x20
00a3bcd0	mov x1,x28
00a3bcd4	ldr x8,[x8, #0xf8]
00a3bcd8	mov x2,x27
00a3bcdc	mov x4,x19
00a3bce0	blr x8
00a3bce4	cbz w0,0x00a3be9c
00a3bce8	ldr x1,[x21, #0x10]
00a3bcec	ldr x2,[x21, #0x20]
00a3bcf0	ldr x3,[x20, #0x40]
00a3bcf4	ldr x0,[sp]
00a3bcf8	bl 0x00c38ec0
00a3bcfc	cbz w0,0x00a3be9c
00a3bd00	ldr x8,[x20]
00a3bd04	ldr x1,[sp]
00a3bd08	mov x0,x20
00a3bd0c	mov x3,x19
00a3bd10	ldr x8,[x8, #0x100]
00a3bd14	mov x2,x1
00a3bd18	blr x8
00a3bd1c	cbz w0,0x00a3be9c
00a3bd20	ldr x0,[sp]
00a3bd24	ldr x3,[x20, #0x40]
00a3bd28	mov x2,x23
00a3bd2c	mov x1,x0
00a3bd30	bl 0x00c38f20
00a3bd34	cbz w0,0x00a3be9c
00a3bd38	ldr x0,[sp]
00a3bd3c	ldr x3,[x20, #0x40]
00a3bd40	mov x2,x27
00a3bd44	mov x1,x0
00a3bd48	bl 0x00c38f20
00a3bd4c	cbz w0,0x00a3be9c
00a3bd50	ldr x3,[x20, #0x40]
00a3bd54	mov x0,x24
00a3bd58	mov x1,x23
00a3bd5c	mov x2,x28
00a3bd60	bl 0x00c38f20
00a3bd64	cbz w0,0x00a3be9c
00a3bd68	ldr x8,[x20]
00a3bd6c	mov x0,x20
00a3bd70	mov x1,x24
00a3bd74	mov x2,x24
00a3bd78	ldr x8,[x8, #0x100]
00a3bd7c	mov x3,x19
00a3bd80	blr x8
00a3bd84	cbz w0,0x00a3be9c
00a3bd88	ldr x8,[x20]
00a3bd8c	ldr x3,[sp]
00a3bd90	mov x0,x20
00a3bd94	mov x1,x26
00a3bd98	ldr x8,[x8, #0xf8]
00a3bd9c	mov x2,x27
00a3bda0	mov x4,x19
00a3bda4	blr x8
00a3bda8	cbz w0,0x00a3be9c
00a3bdac	ldr x8,[x20]
00a3bdb0	ldr x2,[sp, #0x8]
00a3bdb4	mov x0,x20
00a3bdb8	mov x1,x26
00a3bdbc	ldr x8,[x8, #0xf8]
00a3bdc0	mov x3,x26
00a3bdc4	mov x4,x19
00a3bdc8	blr x8
00a3bdcc	cbz w0,0x00a3be9c
00a3bdd0	ldr x0,[x21, #0x10]
00a3bdd4	ldr x3,[x20, #0x40]
00a3bdd8	mov x1,x24
00a3bddc	mov x2,x26
00a3bde0	bl 0x00c38f20
00a3bde4	cbz w0,0x00a3be9c
00a3bde8	ldr x3,[x20, #0x40]
00a3bdec	mov x0,x24
00a3bdf0	mov x1,x23
00a3bdf4	mov x2,x28
00a3bdf8	bl 0x00c38ec0
00a3bdfc	cbz w0,0x00a3be9c
00a3be00	ldr x8,[x20]
00a3be04	mov x0,x20
00a3be08	mov x1,x23
00a3be0c	mov x2,x27
00a3be10	ldr x8,[x8, #0x100]
00a3be14	mov x3,x19
00a3be18	blr x8
00a3be1c	cbz w0,0x00a3be9c
00a3be20	ldr x8,[x20]
00a3be24	ldr x3,[sp, #0x8]
00a3be28	mov x0,x20
00a3be2c	mov x1,x23
00a3be30	ldr x8,[x8, #0xf8]
00a3be34	mov x2,x23
00a3be38	mov x4,x19
00a3be3c	blr x8
00a3be40	cbz w0,0x00a3be9c
00a3be44	ldr x8,[x20]
00a3be48	ldr x1,[sp]
00a3be4c	mov x0,x20
00a3be50	mov x3,x24
00a3be54	ldr x8,[x8, #0xf8]
00a3be58	mov x2,x1
00a3be5c	mov x4,x19
00a3be60	blr x8
00a3be64	cbz w0,0x00a3be9c
00a3be68	ldr x0,[sp]
00a3be6c	ldr x2,[x20, #0x40]
00a3be70	mov x1,x0
00a3be74	bl 0x00c38ed0
00a3be78	cbz w0,0x00a3be9c
00a3be7c	ldr x0,[x21, #0x20]
00a3be80	ldr x3,[x20, #0x40]
00a3be84	ldr x2,[sp]
00a3be88	mov x1,x23
00a3be8c	bl 0x00c38ec0
00a3be90	cmp w0,#0x0
00a3be94	cset w20,ne
00a3be98	b 0x00a3bea0
00a3be9c	mov w20,wzr
00a3bea0	mov x0,x19
00a3bea4	bl 0x00c38a20
00a3bea8	mov w0,w20
00a3beac	ldp x29,x30,[sp, #0x60]
00a3beb0	ldp x20,x19,[sp, #0x50]
00a3beb4	ldp x22,x21,[sp, #0x40]
00a3beb8	ldp x24,x23,[sp, #0x30]
00a3bebc	ldp x26,x25,[sp, #0x20]
00a3bec0	ldp x28,x27,[sp, #0x10]
00a3bec4	add sp,sp,#0x70
00a3bec8	ret
