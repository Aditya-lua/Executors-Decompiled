; ossl_bn_rsa_fips186_4_derive_prime @ 00adad2c
00adad2c	sub sp,sp,#0xa0
00adad30	stp x6,x0,[sp, #0x18]
00adad34	mov x0,x7
00adad38	stp x28,x27,[sp, #0x40]
00adad3c	stp x26,x25,[sp, #0x50]
00adad40	stp x24,x23,[sp, #0x60]
00adad44	stp x22,x21,[sp, #0x70]
00adad48	stp x20,x19,[sp, #0x80]
00adad4c	stp x29,x30,[sp, #0x90]
00adad50	add x29,sp,#0x90
00adad54	mov x19,x7
00adad58	mov w26,w5
00adad5c	mov x21,x4
00adad60	mov x24,x3
00adad64	mov x22,x2
00adad68	mov x23,x1
00adad6c	bl 0x00c38a90
00adad70	mov x0,x19
00adad74	bl 0x00c38a40
00adad78	str x0,[sp, #0x38]
00adad7c	mov x0,x19
00adad80	bl 0x00c38a40
00adad84	str x0,[sp, #0x30]
00adad88	mov x0,x19
00adad8c	bl 0x00c38a40
00adad90	mov x27,x0
00adad94	mov x0,x19
00adad98	bl 0x00c38a40
00adad9c	mov x28,x0
00adada0	mov x0,x19
00adada4	bl 0x00c38a40
00adada8	str x0,[sp, #0x28]
00adadac	mov x0,x19
00adadb0	bl 0x00c38a40
00adadb4	mov x20,x0
00adadb8	mov x0,x19
00adadbc	bl 0x00c38a40
00adadc0	cbz x0,0x00adaf50
00adadc4	mov x25,x0
00adadc8	str x27,[sp, #0x10]
00adadcc	asr w27,w26,#0x1
00adadd0	cbz x22,0x00adaedc
00adadd4	mov x0,x23
00adadd8	mov x1,x22
00adaddc	bl 0x00c36990
00adade0	cbz x0,0x00adaf50
00adade4	mov x0,x25
00adade8	mov x1,x24
00adadec	bl 0x00c39050
00adadf0	cbz w0,0x00adaf50
00adadf4	mov x0,x28
00adadf8	mov x1,x25
00adadfc	mov x2,x21
00adae00	mov x3,x19
00adae04	bl 0x00c38b10
00adae08	cbz w0,0x00adaf50
00adae0c	mov x0,x28
00adae10	bl 0x00c38d20
00adae14	cbz w0,0x00adaf50
00adae18	ldr x24,[sp, #0x10]
00adae1c	mov x1,x21
00adae20	mov x2,x25
00adae24	mov x3,x19
00adae28	mov x0,x24
00adae2c	bl 0x00c38b20
00adae30	cbz x0,0x00adaf50
00adae34	mov x0,x24
00adae38	mov x1,x24
00adae3c	mov x2,x21
00adae40	mov x3,x19
00adae44	bl 0x00c39060
00adae48	cbz w0,0x00adaf50
00adae4c	mov x0,x28
00adae50	mov x1,x25
00adae54	mov x2,x21
00adae58	mov x3,x19
00adae5c	bl 0x00c38b20
00adae60	cbz x0,0x00adaf50
00adae64	mov x0,x28
00adae68	mov x1,x28
00adae6c	mov x2,x25
00adae70	mov x3,x19
00adae74	bl 0x00c39060
00adae78	cbz w0,0x00adaf50
00adae7c	ldr x0,[sp, #0x10]
00adae80	mov x2,x28
00adae84	mov x1,x0
00adae88	bl 0x00c38880
00adae8c	cbz w0,0x00adaf50
00adae90	ldr x0,[sp, #0x28]
00adae94	mov x1,x25
00adae98	mov x2,x21
00adae9c	mov x3,x19
00adaea0	bl 0x00c39060
00adaea4	cbz w0,0x00adaf50
00adaea8	ldr x21,[sp, #0x10]
00adaeac	mov x0,x21
00adaeb0	bl 0x00c37f40
00adaeb4	cbz w0,0x00adaecc
00adaeb8	ldr x2,[sp, #0x28]
00adaebc	mov x0,x21
00adaec0	mov x1,x21
00adaec4	bl 0x00c38870
00adaec8	cbz w0,0x00adaf50
00adaecc	ldr x26,[sp, #0x20]
00adaed0	str w27,[sp, #0xc]
00adaed4	cbnz x22,0x00adafb4
00adaed8	b 0x00adaf88
00adaedc	adrp x0,0xcb5000
00adaee0	ldr x0,[x0, #0x448]
00adaee4	bl 0x00c322f0
00adaee8	cmp w27,w0
00adaeec	mov w26,wzr
00adaef0	b.lt 0x00adaf54
00adaef4	adrp x26,0xcb5000
00adaef8	ldr x26,[x26, #0x448]
00adaefc	mov x0,x26
00adaf00	bl 0x00c322f0
00adaf04	sub w2,w27,w0
00adaf08	ldr x0,[sp, #0x38]
00adaf0c	mov x1,x26
00adaf10	bl 0x00c38fc0
00adaf14	cbz w0,0x00adaf50
00adaf18	bl 0x00c38de0
00adaf1c	ldr x26,[sp, #0x30]
00adaf20	mov x1,x0
00adaf24	mov w2,w27
00adaf28	str w27,[sp, #0xc]
00adaf2c	mov x0,x26
00adaf30	bl 0x00c38fc0
00adaf34	cbz w0,0x00adaf50
00adaf38	ldr x2,[sp, #0x38]
00adaf3c	mov x0,x26
00adaf40	mov x1,x26
00adaf44	bl 0x00c38880
00adaf48	ldr w27,[sp, #0xc]
00adaf4c	cbnz w0,0x00adade4
00adaf50	mov w26,wzr
00adaf54	mov x0,x20
00adaf58	bl 0x00c38ca0
00adaf5c	mov x0,x19
00adaf60	bl 0x00c38a20
00adaf64	mov w0,w26
00adaf68	ldp x29,x30,[sp, #0x90]
00adaf6c	ldp x20,x19,[sp, #0x80]
00adaf70	ldp x22,x21,[sp, #0x70]
00adaf74	ldp x24,x23,[sp, #0x60]
00adaf78	ldp x26,x25,[sp, #0x50]
00adaf7c	ldp x28,x27,[sp, #0x40]
00adaf80	add sp,sp,#0xa0
00adaf84	ret
00adaf88	ldr x1,[sp, #0x30]
00adaf8c	mov x0,x23
00adaf90	mov w2,wzr
00adaf94	mov x3,x19
00adaf98	bl 0x00c39160
00adaf9c	ldr x2,[sp, #0x38]
00adafa0	cbz w0,0x00adaf50
00adafa4	mov x0,x23
00adafa8	mov x1,x23
00adafac	bl 0x00c38870
00adafb0	cbz w0,0x00adaf50
00adafb4	ldr x3,[sp, #0x28]
00adafb8	mov x0,x26
00adafbc	mov x1,x21
00adafc0	mov x2,x23
00adafc4	mov x4,x19
00adafc8	bl 0x00c38f10
00adafcc	cbz w0,0x00adaf50
00adafd0	mov x0,x26
00adafd4	mov x1,x26
00adafd8	mov x2,x23
00adafdc	bl 0x00c38870
00adafe0	cbz w0,0x00adaf50
00adafe4	ldr w27,[sp, #0xc]
00adafe8	ldr x21,[x29, #0x10]
00adafec	mov w24,wzr
00adaff0	add w8,w27,w27, LSL #0x2
00adaff4	lsl w25,w8,#0x2
00adaff8	ldr x26,[sp, #0x20]
00adaffc	mov x0,x26
00adb000	bl 0x00c322f0
00adb004	cmp w0,w27
00adb008	b.gt 0x00adb0b4
00adb00c	mov w2,#0x2
00adb010	mov x0,x21
00adb014	mov w1,wzr
00adb018	bl 0x00c39100
00adb01c	mov x0,x20
00adb020	mov x1,x26
00adb024	bl 0x00c36990
00adb028	cbz x0,0x00adaf50
00adb02c	mov w1,#0x1
00adb030	mov x0,x20
00adb034	bl 0x00c38fd0
00adb038	cbz w0,0x00adaf50
00adb03c	ldr x2,[sp, #0x18]
00adb040	mov x0,x28
00adb044	mov x1,x20
00adb048	mov x3,x19
00adb04c	bl 0x00c38b10
00adb050	cbz w0,0x00adaf50
00adb054	mov x0,x28
00adb058	bl 0x00c38d20
00adb05c	cbz w0,0x00adb088
00adb060	mov x0,x26
00adb064	mov x1,x19
00adb068	mov x2,x21
00adb06c	bl 0x00c39110
00adb070	lsr w8,w0,#0x1e
00adb074	and w8,w8,#0x2
00adb078	cmp w0,#0x0
00adb07c	orr w9,wzr,#0x7
00adb080	csel w8,w9,w8,gt
00adb084	cbnz w8,0x00adb0f0
00adb088	add w24,w24,#0x1
00adb08c	cmp w24,w25
00adb090	b.ge 0x00adb0c0
00adb094	ldr x2,[sp, #0x28]
00adb098	mov x0,x26
00adb09c	mov x1,x26
00adb0a0	bl 0x00c38870
00adb0a4	ldr w27,[sp, #0xc]
00adb0a8	mov w26,wzr
00adb0ac	cbnz w0,0x00adaff8
00adb0b0	b 0x00adaf54
00adb0b4	ldr x21,[sp, #0x10]
00adb0b8	cbz x22,0x00adaf88
00adb0bc	b 0x00adaf50
00adb0c0	bl 0x00c342a0
00adb0c4	adrp x0,0x2d6000
00adb0c8	adrp x2,0x2c8000
00adb0cc	add x0,x0,#0x5a6
00adb0d0	add x2,x2,#0x265
00adb0d4	mov w1,#0x161
00adb0d8	bl 0x00c342b0
00adb0dc	orr w0,wzr,#0x3
00adb0e0	mov w1,#0x79
00adb0e4	mov x2,xzr
00adb0e8	bl 0x00c342c0
00adb0ec	b 0x00adaf50
00adb0f0	cmp w8,#0x2
00adb0f4	b.eq 0x00adaf50
00adb0f8	cmp w8,#0x7
00adb0fc	b.ne 0x00adb118
00adb100	orr w1,wzr,#0x3
00adb104	mov x0,x21
00adb108	mov w2,wzr
00adb10c	bl 0x00c39100
00adb110	mov w26,#0x1
00adb114	b 0x00adaf54
00adb118	b 0x00adaf64
