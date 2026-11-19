; ossl_bn_rsa_fips186_4_gen_prob_primes @ 00ada9e8
00ada9e8	sub sp,sp,#0xa0
00ada9ec	stp x26,x25,[sp, #0x50]
00ada9f0	mov w26,wzr
00ada9f4	stp x28,x27,[sp, #0x40]
00ada9f8	stp x24,x23,[sp, #0x60]
00ada9fc	stp x22,x21,[sp, #0x70]
00adaa00	stp x20,x19,[sp, #0x80]
00adaa04	stp x29,x30,[sp, #0x90]
00adaa08	add x29,sp,#0x90
00adaa0c	cbz x0,0x00adac5c
00adaa10	mov x28,x1
00adaa14	cbz x1,0x00adac5c
00adaa18	ldr x20,[x29, #0x18]
00adaa1c	mov x25,x0
00adaa20	mov w27,w7
00adaa24	mov x19,x6
00adaa28	mov x0,x20
00adaa2c	mov x21,x5
00adaa30	mov x22,x3
00adaa34	mov x23,x2
00adaa38	str x4,[sp, #0x20]
00adaa3c	bl 0x00c38a90
00adaa40	mov x24,x23
00adaa44	cbz x23,0x00adaa94
00adaa48	mov x26,x22
00adaa4c	cbz x22,0x00adaaa8
00adaa50	str x21,[sp, #0x38]
00adaa54	cbz x21,0x00adaabc
00adaa58	str x19,[sp, #0x30]
00adaa5c	cbz x19,0x00adaad0
00adaa60	str x26,[sp, #0x28]
00adaa64	cbz x24,0x00adac08
00adaa68	cbz x26,0x00adac44
00adaa6c	ldr x8,[sp, #0x38]
00adaa70	cbz x8,0x00adac08
00adaa74	ldr x8,[sp, #0x30]
00adaa78	mov w26,wzr
00adaa7c	cbz x8,0x00adac44
00adaa80	cmp w27,#0xfff
00adaa84	b.le 0x00adaae8
00adaa88	mov w26,#0xc9
00adaa8c	cbnz x21,0x00adab30
00adaa90	b 0x00adab10
00adaa94	mov x0,x20
00adaa98	bl 0x00c38a40
00adaa9c	mov x24,x0
00adaaa0	mov x26,x22
00adaaa4	cbnz x22,0x00adaa50
00adaaa8	mov x0,x20
00adaaac	bl 0x00c38a40
00adaab0	mov x26,x0
00adaab4	str x21,[sp, #0x38]
00adaab8	cbnz x21,0x00adaa58
00adaabc	mov x0,x20
00adaac0	bl 0x00c38a40
00adaac4	str x0,[sp, #0x38]
00adaac8	str x19,[sp, #0x30]
00adaacc	cbnz x19,0x00adaa60
00adaad0	mov x0,x20
00adaad4	bl 0x00c38a40
00adaad8	str x0,[sp, #0x30]
00adaadc	str x26,[sp, #0x28]
00adaae0	cbnz x24,0x00adaa68
00adaae4	b 0x00adac08
00adaae8	cmp w27,#0xbff
00adaaec	b.le 0x00adaafc
00adaaf0	mov w26,#0xab
00adaaf4	cbnz x21,0x00adab30
00adaaf8	b 0x00adab10
00adaafc	cmp w27,#0x800
00adab00	mov w26,wzr
00adab04	b.lt 0x00adac44
00adab08	mov w26,#0x8d
00adab0c	cbnz x21,0x00adab30
00adab10	ldr x0,[sp, #0x38]
00adab14	mov w3,#0x1
00adab18	mov w1,w26
00adab1c	mov w2,wzr
00adab20	mov w4,wzr
00adab24	mov x5,x20
00adab28	bl 0x00c39150
00adab2c	cbz w0,0x00adac08
00adab30	cbnz x19,0x00adab54
00adab34	ldr x0,[sp, #0x30]
00adab38	mov w3,#0x1
00adab3c	mov w1,w26
00adab40	mov w2,wzr
00adab44	mov w4,wzr
00adab48	mov x5,x20
00adab4c	bl 0x00c39150
00adab50	cbz w0,0x00adac08
00adab54	ldr x26,[x29, #0x20]
00adab58	ldr x0,[sp, #0x38]
00adab5c	mov x1,x24
00adab60	mov x2,x20
00adab64	mov x3,x26
00adab68	bl 0x00adac80
00adab6c	cbz w0,0x00adac40
00adab70	mov x3,x26
00adab74	ldp x26,x0,[sp, #0x28]
00adab78	mov x2,x20
00adab7c	str x3,[sp, #0x18]
00adab80	mov x1,x26
00adab84	bl 0x00adac80
00adab88	cbz w0,0x00adac08
00adab8c	mov x0,x24
00adab90	bl 0x00c322f0
00adab94	str w0,[sp, #0x14]
00adab98	mov x0,x26
00adab9c	bl 0x00c322f0
00adaba0	ldr w8,[sp, #0x14]
00adaba4	cmp w27,#0xbff
00adaba8	mov w9,#0x3ef
00adabac	mov w10,#0x5ee
00adabb0	csel w9,w10,w9,gt
00adabb4	cmp w27,#0xfff
00adabb8	mov w10,#0x7ee
00adabbc	add w8,w0,w8
00adabc0	csel w9,w10,w9,gt
00adabc4	cmp w8,w9
00adabc8	mov w26,wzr
00adabcc	b.ge 0x00adac44
00adabd0	ldr x6,[x29, #0x10]
00adabd4	ldp x8,x2,[sp, #0x18]
00adabd8	ldr x4,[sp, #0x28]
00adabdc	mov x0,x25
00adabe0	mov x1,x28
00adabe4	mov x3,x24
00adabe8	mov w5,w27
00adabec	mov x7,x20
00adabf0	str x8,[sp]
00adabf4	bl 0x00adad2c
00adabf8	cmp w0,#0x0
00adabfc	cset w26,ne
00adac00	cbnz x23,0x00adac48
00adac04	b 0x00adac10
00adac08	mov w26,wzr
00adac0c	cbnz x23,0x00adac48
00adac10	mov x0,x24
00adac14	bl 0x00c38ca0
00adac18	cbnz x22,0x00adac4c
00adac1c	ldr x0,[sp, #0x28]
00adac20	bl 0x00c38ca0
00adac24	cbnz x21,0x00adac50
00adac28	ldr x0,[sp, #0x38]
00adac2c	bl 0x00c38ca0
00adac30	cbnz x19,0x00adac54
00adac34	ldr x0,[sp, #0x30]
00adac38	bl 0x00c38ca0
00adac3c	b 0x00adac54
00adac40	mov w26,wzr
00adac44	cbz x23,0x00adac10
00adac48	cbz x22,0x00adac1c
00adac4c	cbz x21,0x00adac28
00adac50	cbz x19,0x00adac34
00adac54	mov x0,x20
00adac58	bl 0x00c38a20
00adac5c	mov w0,w26
00adac60	ldp x29,x30,[sp, #0x90]
00adac64	ldp x20,x19,[sp, #0x80]
00adac68	ldp x22,x21,[sp, #0x70]
00adac6c	ldp x24,x23,[sp, #0x60]
00adac70	ldp x26,x25,[sp, #0x50]
00adac74	ldp x28,x27,[sp, #0x40]
00adac78	add sp,sp,#0xa0
00adac7c	ret
