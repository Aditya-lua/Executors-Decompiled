; EVP_PKEY_CTX_get0_dh_kdf_ukm @ 00a572ac
00a572ac	sub sp,sp,#0xa0
00a572b0	str x19,[sp, #0x80]
00a572b4	stp x29,x30,[sp, #0x90]
00a572b8	add x29,sp,#0x90
00a572bc	cbz x0,0x00a57370
00a572c0	ldr w8,[x0]
00a572c4	mov x19,x0
00a572c8	cmp w8,#0x800
00a572cc	b.ne 0x00a57370
00a572d0	ldr x8,[x19, #0x20]
00a572d4	cbz x8,0x00a573b0
00a572d8	adrp x0,0x29e000
00a572dc	add x0,x0,#0x10e
00a572e0	add x8,sp,#0x8
00a572e4	mov x2,xzr
00a572e8	bl 0x00c36de0
00a572ec	ldr x8,[sp, #0x28]
00a572f0	ldur q0,[sp, #0x18]
00a572f4	ldur q1,[sp, #0x8]
00a572f8	str x8,[sp, #0x50]
00a572fc	add x8,sp,#0x8
00a57300	stp q1,q0,[sp, #0x30]
00a57304	bl 0x00c34c40
00a57308	ldr x8,[sp, #0x28]
00a5730c	ldur q0,[sp, #0x18]
00a57310	ldur q1,[sp, #0x8]
00a57314	add x1,sp,#0x30
00a57318	mov x0,x19
00a5731c	str x8,[sp, #0x78]
00a57320	stur q0,[sp, #0x68]
00a57324	stur q1,[sp, #0x58]
00a57328	bl 0x00c3c110
00a5732c	cmp w0,#0x1
00a57330	b.eq 0x00a573d0
00a57334	cmn w0,#0x2
00a57338	b.ne 0x00a573c8
00a5733c	bl 0x00c342a0
00a57340	adrp x0,0x2cf000
00a57344	adrp x2,0x2af000
00a57348	add x0,x0,#0xb4f
00a5734c	add x2,x2,#0xf25
00a57350	mov w1,#0x150
00a57354	bl 0x00c342b0
00a57358	orr w0,wzr,#0x6
00a5735c	mov w1,#0x93
00a57360	mov x2,xzr
00a57364	bl 0x00c342c0
00a57368	mov w0,#0xffffffff
00a5736c	b 0x00a573a0
00a57370	bl 0x00c342a0
00a57374	adrp x0,0x2cf000
00a57378	adrp x2,0x2b7000
00a5737c	add x0,x0,#0xb4f
00a57380	add x2,x2,#0xc4b
00a57384	mov w1,#0x25
00a57388	bl 0x00c342b0
00a5738c	orr w0,wzr,#0x6
00a57390	mov w1,#0x93
00a57394	mov x2,xzr
00a57398	bl 0x00c342c0
00a5739c	orr w0,wzr,#0xfffffffe
00a573a0	ldp x29,x30,[sp, #0x90]
00a573a4	ldr x19,[sp, #0x80]
00a573a8	add sp,sp,#0xa0
00a573ac	ret
00a573b0	ldr x8,[x19, #0x78]
00a573b4	ldr w8,[x8]
00a573b8	cmp w8,#0x398
00a573bc	b.eq 0x00a572d8
00a573c0	cmp w8,#0x1c
00a573c4	b.eq 0x00a572d8
00a573c8	mov w0,#0xffffffff
00a573cc	b 0x00a573a0
00a573d0	ldr x8,[sp, #0x50]
00a573d4	lsr x9,x8,#0x1f
00a573d8	cmp x9,#0x0
00a573dc	csinv w0,w8,wzr,eq
00a573e0	b 0x00a573a0
