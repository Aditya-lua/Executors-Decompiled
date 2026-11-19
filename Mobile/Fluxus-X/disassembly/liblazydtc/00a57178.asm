; EVP_PKEY_CTX_set0_dh_kdf_ukm @ 00a57178
00a57178	sub sp,sp,#0xa0
00a5717c	stp x20,x19,[sp, #0x80]
00a57180	stp x29,x30,[sp, #0x90]
00a57184	add x29,sp,#0x90
00a57188	tbnz w2,#0x1f,0x00a5727c
00a5718c	mov x20,x0
00a57190	cbz x0,0x00a57230
00a57194	ldr w8,[x20]
00a57198	cmp w8,#0x800
00a5719c	b.ne 0x00a57230
00a571a0	ldr x8,[x20, #0x20]
00a571a4	mov x19,x1
00a571a8	cbz x8,0x00a57264
00a571ac	adrp x0,0x29e000
00a571b0	sxtw x2,w2
00a571b4	add x0,x0,#0x10e
00a571b8	add x8,sp,#0x8
00a571bc	mov x1,x19
00a571c0	bl 0x00c34c50
00a571c4	ldr x8,[sp, #0x28]
00a571c8	ldur q0,[sp, #0x18]
00a571cc	ldur q1,[sp, #0x8]
00a571d0	str x8,[sp, #0x50]
00a571d4	add x8,sp,#0x8
00a571d8	stp q1,q0,[sp, #0x30]
00a571dc	bl 0x00c34c40
00a571e0	ldr x8,[sp, #0x28]
00a571e4	ldur q0,[sp, #0x18]
00a571e8	ldur q1,[sp, #0x8]
00a571ec	add x1,sp,#0x30
00a571f0	mov x0,x20
00a571f4	str x8,[sp, #0x78]
00a571f8	stur q0,[sp, #0x68]
00a571fc	stur q1,[sp, #0x58]
00a57200	bl 0x00c3c120
00a57204	cmp w0,#0x1
00a57208	b.eq 0x00a57290
00a5720c	cmn w0,#0x2
00a57210	b.ne 0x00a57280
00a57214	bl 0x00c342a0
00a57218	adrp x0,0x2cf000
00a5721c	adrp x2,0x2d7000
00a57220	add x0,x0,#0xb4f
00a57224	add x2,x2,#0xe60
00a57228	mov w1,#0x139
00a5722c	b 0x00a57248
00a57230	bl 0x00c342a0
00a57234	adrp x0,0x2cf000
00a57238	adrp x2,0x2b7000
00a5723c	add x0,x0,#0xb4f
00a57240	add x2,x2,#0xc4b
00a57244	mov w1,#0x25
00a57248	bl 0x00c342b0
00a5724c	orr w0,wzr,#0x6
00a57250	mov w1,#0x93
00a57254	mov x2,xzr
00a57258	bl 0x00c342c0
00a5725c	orr w0,wzr,#0xfffffffe
00a57260	b 0x00a57280
00a57264	ldr x8,[x20, #0x78]
00a57268	ldr w8,[x8]
00a5726c	cmp w8,#0x398
00a57270	b.eq 0x00a571ac
00a57274	cmp w8,#0x1c
00a57278	b.eq 0x00a571ac
00a5727c	mov w0,#0xffffffff
00a57280	ldp x29,x30,[sp, #0x90]
00a57284	ldp x20,x19,[sp, #0x80]
00a57288	add sp,sp,#0xa0
00a5728c	ret
00a57290	adrp x1,0x2cf000
00a57294	add x1,x1,#0xb4f
00a57298	mov w2,#0x13b
00a5729c	mov x0,x19
00a572a0	bl 0x00c32310
00a572a4	mov w0,#0x1
00a572a8	b 0x00a57280
