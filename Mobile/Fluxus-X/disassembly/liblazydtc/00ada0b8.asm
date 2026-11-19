; ossl_rsa_check_prime_factor @ 00ada0b8
00ada0b8	str x23,[sp, #-0x40]!
00ada0bc	stp x22,x21,[sp, #0x10]
00ada0c0	stp x20,x19,[sp, #0x20]
00ada0c4	mov w21,w2
00ada0c8	mov x20,x1
00ada0cc	mov x1,x3
00ada0d0	mov x2,xzr
00ada0d4	stp x29,x30,[sp, #0x30]
00ada0d8	add x29,sp,#0x30
00ada0dc	mov x19,x3
00ada0e0	mov x22,x0
00ada0e4	bl 0x00c39110
00ada0e8	cmp w0,#0x1
00ada0ec	mov w23,wzr
00ada0f0	b.ne 0x00ada1ac
00ada0f4	mov x0,x22
00ada0f8	mov w1,w21
00ada0fc	mov x2,x19
00ada100	bl 0x00ad9fe0
00ada104	cmp w0,#0x1
00ada108	mov w23,wzr
00ada10c	b.ne 0x00ada1ac
00ada110	mov x0,x19
00ada114	bl 0x00c38a90
00ada118	mov x0,x19
00ada11c	bl 0x00c38a40
00ada120	mov x21,x0
00ada124	mov x0,x19
00ada128	bl 0x00c38a40
00ada12c	mov x23,x0
00ada130	cbz x0,0x00ada19c
00ada134	mov w1,#0x4
00ada138	mov x0,x21
00ada13c	bl 0x00c38dc0
00ada140	mov w1,#0x4
00ada144	mov x0,x23
00ada148	bl 0x00c38dc0
00ada14c	mov x0,x21
00ada150	mov x1,x22
00ada154	bl 0x00c36990
00ada158	cbz x0,0x00ada198
00ada15c	mov w1,#0x1
00ada160	mov x0,x21
00ada164	bl 0x00c38fd0
00ada168	cbz w0,0x00ada198
00ada16c	mov x0,x23
00ada170	mov x1,x21
00ada174	mov x2,x20
00ada178	mov x3,x19
00ada17c	bl 0x00c38b10
00ada180	cbz w0,0x00ada198
00ada184	mov x0,x23
00ada188	bl 0x00c38d20
00ada18c	cmp w0,#0x0
00ada190	cset w23,ne
00ada194	b 0x00ada19c
00ada198	mov w23,wzr
00ada19c	mov x0,x21
00ada1a0	bl 0x00c38ca0
00ada1a4	mov x0,x19
00ada1a8	bl 0x00c38a20
00ada1ac	ldp x29,x30,[sp, #0x30]
00ada1b0	ldp x20,x19,[sp, #0x20]
00ada1b4	ldp x22,x21,[sp, #0x10]
00ada1b8	mov w0,w23
00ada1bc	ldr x23,[sp], #0x40
00ada1c0	ret
