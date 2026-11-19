; EVP_CIPHER_get_type @ 00a5ec38
00a5ec38	str x21,[sp, #-0x30]!
00a5ec3c	stp x20,x19,[sp, #0x10]
00a5ec40	stp x29,x30,[sp, #0x20]
00a5ec44	ldr w19,[x0]
00a5ec48	add x29,sp,#0x20
00a5ec4c	cmp w19,#0x1a8
00a5ec50	b.gt 0x00a5ec7c
00a5ec54	cmp w19,#0x60
00a5ec58	mov w20,#0x25
00a5ec5c	b.gt 0x00a5ec9c
00a5ec60	cmp w19,#0x24
00a5ec64	b.gt 0x00a5ecb8
00a5ec68	cmp w19,#0x5
00a5ec6c	b.eq 0x00a5ece8
00a5ec70	cmp w19,#0x1e
00a5ec74	b.eq 0x00a5ecc8
00a5ec78	b 0x00a5ed10
00a5ec7c	sub w8,w19,#0x28a
00a5ec80	cmp w8,#0x9
00a5ec84	b.hi 0x00a5ecf0
00a5ec88	adrp x9,0x766000
00a5ec8c	add x9,x9,#0x2c8
00a5ec90	ldrsw x8,[x9, x8, LSL #0x2]
00a5ec94	add x8,x8,x9
00a5ec98	br x8
00a5ec9c	cmp w19,#0xa5
00a5eca0	b.gt 0x00a5ecd0
00a5eca4	cmp w19,#0x61
00a5eca8	b.eq 0x00a5ece8
00a5ecac	cmp w19,#0x62
00a5ecb0	b.eq 0x00a5ed30
00a5ecb4	b 0x00a5ed10
00a5ecb8	cmp w19,#0x25
00a5ecbc	b.eq 0x00a5ed30
00a5ecc0	cmp w19,#0x3d
00a5ecc4	b.ne 0x00a5ed10
00a5ecc8	orr w20,wzr,#0x1e
00a5eccc	b 0x00a5ed30
00a5ecd0	cmp w19,#0xa6
00a5ecd4	b.eq 0x00a5ed30
00a5ecd8	cmp w19,#0x1a5
00a5ecdc	b.ne 0x00a5ed10
00a5ece0	mov w20,#0x1a5
00a5ece4	b 0x00a5ed30
00a5ece8	mov w20,#0x5
00a5ecec	b 0x00a5ed30
00a5ecf0	cmp w19,#0x1a9
00a5ecf4	b.eq 0x00a5ed08
00a5ecf8	cmp w19,#0x1ad
00a5ecfc	b.ne 0x00a5ed10
00a5ed00	mov w20,#0x1ad
00a5ed04	b 0x00a5ed30
00a5ed08	mov w20,#0x1a9
00a5ed0c	b 0x00a5ed30
00a5ed10	mov w0,w19
00a5ed14	bl 0x00c37740
00a5ed18	mov x21,x0
00a5ed1c	bl 0x00c3d020
00a5ed20	cmp x0,#0x0
00a5ed24	mov x0,x21
00a5ed28	csel w20,wzr,w19,eq
00a5ed2c	bl 0x00c37660
00a5ed30	mov w0,w20
00a5ed34	ldp x29,x30,[sp, #0x20]
00a5ed38	ldp x20,x19,[sp, #0x10]
00a5ed3c	ldr x21,[sp], #0x30
00a5ed40	ret
