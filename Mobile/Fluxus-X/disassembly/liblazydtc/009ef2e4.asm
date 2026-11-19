; ossl_asn1_time_print_ex @ 009ef2e4
009ef2e4	sub sp,sp,#0xa0
009ef2e8	stp x20,x19,[sp, #0x80]
009ef2ec	mov x19,x0
009ef2f0	add x0,sp,#0x18
009ef2f4	str x25,[sp, #0x50]
009ef2f8	stp x24,x23,[sp, #0x60]
009ef2fc	stp x22,x21,[sp, #0x70]
009ef300	stp x29,x30,[sp, #0x90]
009ef304	add x29,sp,#0x90
009ef308	mov x20,x2
009ef30c	mov x21,x1
009ef310	bl 0x009ee624
009ef314	cbz w0,0x009ef370
009ef318	ldp w24,w8,[x21]
009ef31c	ldr x23,[x21, #0x8]
009ef320	cmp w8,#0x18
009ef324	sxtw x24,w24
009ef328	add x9,x23,x24
009ef32c	ldurb w21,[x9, #-0x1]
009ef330	b.ne 0x009ef390
009ef334	cmp w24,#0x10
009ef338	b.lt 0x009ef3e0
009ef33c	mov x22,x23
009ef340	ldrb w8,[x22, #0xe]!
009ef344	cmp w8,#0x2e
009ef348	b.ne 0x009ef3e0
009ef34c	orr w25,wzr,#0xf
009ef350	ldrb w0,[x23, x25]
009ef354	bl 0x00c379b0
009ef358	cbz w0,0x009ef368
009ef35c	add x25,x25,#0x1
009ef360	cmp x25,x24
009ef364	b.lt 0x009ef350
009ef368	sub w7,w25,#0xe
009ef36c	b 0x009ef3e8
009ef370	adrp x1,0x2b3000
009ef374	add x1,x1,#0xffe
009ef378	orr w2,wzr,#0xe
009ef37c	mov x0,x19
009ef380	bl 0x00c34240
009ef384	cmp w0,#0x0
009ef388	csetm w0,ne
009ef38c	b 0x009ef4ec
009ef390	and x8,x20,#0xf
009ef394	cmp x8,#0x1
009ef398	b.ne 0x009ef440
009ef39c	ldp w9,w8,[sp, #0x28]
009ef3a0	ldp w5,w4,[sp, #0x20]
009ef3a4	ldp w7,w6,[sp, #0x18]
009ef3a8	adrp x10,0x2ab000
009ef3ac	adrp x11,0x2bf000
009ef3b0	add x10,x10,#0x32c
009ef3b4	add x11,x11,#0xa5e
009ef3b8	cmp w21,#0x5a
009ef3bc	adrp x1,0x2d9000
009ef3c0	add w2,w8,#0x76c
009ef3c4	add w3,w9,#0x1
009ef3c8	csel x8,x11,x10,eq
009ef3cc	add x1,x1,#0x982
009ef3d0	mov x0,x19
009ef3d4	str x8,[sp]
009ef3d8	bl 0x00c32250
009ef3dc	b 0x009ef4e4
009ef3e0	mov x22,xzr
009ef3e4	mov w7,wzr
009ef3e8	and x8,x20,#0xf
009ef3ec	cmp x8,#0x1
009ef3f0	b.ne 0x009ef48c
009ef3f4	ldp w10,w9,[sp, #0x28]
009ef3f8	ldp w8,w6,[sp, #0x18]
009ef3fc	ldp w5,w4,[sp, #0x20]
009ef400	adrp x11,0x2ab000
009ef404	adrp x12,0x2bf000
009ef408	add x11,x11,#0x32c
009ef40c	add x12,x12,#0xa5e
009ef410	cmp w21,#0x5a
009ef414	adrp x1,0x2a7000
009ef418	add w2,w9,#0x76c
009ef41c	add w3,w10,#0x1
009ef420	csel x9,x12,x11,eq
009ef424	add x1,x1,#0xcea
009ef428	str w7,[sp]
009ef42c	mov x0,x19
009ef430	mov w7,w8
009ef434	stp x22,x9,[sp, #0x8]
009ef438	bl 0x00c32250
009ef43c	b 0x009ef4e4
009ef440	ldp w3,w8,[sp, #0x24]
009ef444	ldr w10,[sp, #0x2c]
009ef448	ldp w5,w4,[sp, #0x1c]
009ef44c	ldr w6,[sp, #0x18]
009ef450	adrp x9,0x74d000
009ef454	adrp x11,0x2ab000
009ef458	adrp x12,0x2bd000
009ef45c	sxtw x8,w8
009ef460	add x9,x9,#0xf50
009ef464	add x11,x11,#0x32c
009ef468	add x12,x12,#0x7a9
009ef46c	cmp w21,#0x5a
009ef470	adrp x1,0x2c1000
009ef474	add x2,x9,x8, LSL #0x2
009ef478	add w7,w10,#0x76c
009ef47c	csel x8,x12,x11,eq
009ef480	add x1,x1,#0x9f2
009ef484	str x8,[sp]
009ef488	b 0x009ef4dc
009ef48c	ldp w3,w8,[sp, #0x24]
009ef490	ldr w10,[sp, #0x2c]
009ef494	adrp x9,0x74d000
009ef498	ldp w5,w4,[sp, #0x1c]
009ef49c	ldr w6,[sp, #0x18]
009ef4a0	adrp x11,0x2ab000
009ef4a4	adrp x12,0x2bd000
009ef4a8	sxtw x8,w8
009ef4ac	add x9,x9,#0xf50
009ef4b0	add x11,x11,#0x32c
009ef4b4	add x12,x12,#0x7a9
009ef4b8	cmp w21,#0x5a
009ef4bc	add x2,x9,x8, LSL #0x2
009ef4c0	add w8,w10,#0x76c
009ef4c4	csel x9,x12,x11,eq
009ef4c8	adrp x1,0x2d9000
009ef4cc	str x9,[sp, #0x10]
009ef4d0	str w8,[sp, #0x8]
009ef4d4	add x1,x1,#0x963
009ef4d8	str x22,[sp]
009ef4dc	mov x0,x19
009ef4e0	bl 0x00c32250
009ef4e4	cmp w0,#0x0
009ef4e8	cset w0,gt
009ef4ec	ldp x29,x30,[sp, #0x90]
009ef4f0	ldp x20,x19,[sp, #0x80]
009ef4f4	ldp x22,x21,[sp, #0x70]
009ef4f8	ldp x24,x23,[sp, #0x60]
009ef4fc	ldr x25,[sp, #0x50]
009ef500	add sp,sp,#0xa0
009ef504	ret
