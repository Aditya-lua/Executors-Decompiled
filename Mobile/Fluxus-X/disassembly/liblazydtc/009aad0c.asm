; ssl3_setup_key_block @ 009aad0c
009aad0c	sub sp,sp,#0xc0
009aad10	stp x28,x27,[sp, #0x60]
009aad14	stp x26,x25,[sp, #0x70]
009aad18	stp x24,x23,[sp, #0x80]
009aad1c	stp x22,x21,[sp, #0x90]
009aad20	stp x20,x19,[sp, #0xa0]
009aad24	stp x29,x30,[sp, #0xb0]
009aad28	ldr x8,[x0, #0x310]
009aad2c	add x29,sp,#0xb0
009aad30	cbz x8,0x009aad3c
009aad34	mov w20,#0x1
009aad38	b 0x009aaff0
009aad3c	mov x19,x0
009aad40	ldr x0,[x0, #0x9a8]
009aad44	ldr x1,[x19, #0x918]
009aad48	add x2,sp,#0x30
009aad4c	add x3,sp,#0x28
009aad50	add x6,sp,#0x20
009aad54	mov x4,xzr
009aad58	mov x5,xzr
009aad5c	mov w7,wzr
009aad60	bl 0x00c34c90
009aad64	cbz w0,0x009aafe0
009aad68	ldr x0,[x19, #0x320]
009aad6c	bl 0x00c34970
009aad70	ldr x8,[sp, #0x30]
009aad74	ldr x0,[x19, #0x328]
009aad78	str x8,[x19, #0x320]
009aad7c	bl 0x00c34980
009aad80	ldp x8,x0,[sp, #0x20]
009aad84	str x0,[x19, #0x328]
009aad88	str x8,[x19, #0x340]
009aad8c	bl 0x00c34c20
009aad90	tbnz w0,#0x1f,0x009aafec
009aad94	mov w28,w0
009aad98	ldr x0,[sp, #0x30]
009aad9c	add x22,x19,#0x310
009aada0	bl 0x00c34bd0
009aada4	ldr x8,[sp, #0x30]
009aada8	mov w27,w0
009aadac	add w21,w0,w28
009aadb0	mov x0,x8
009aadb4	bl 0x00c34bc0
009aadb8	ldr x8,[x19, #0x318]
009aadbc	ldr x1,[x19, #0x310]
009aadc0	add w26,w21,w0
009aadc4	adrp x21,0x2a3000
009aadc8	add x21,x21,#0xb34
009aadcc	mov w20,w0
009aadd0	mov w3,#0x13a
009aadd4	mov x0,x8
009aadd8	mov x2,x21
009aaddc	lsl w23,w26,#0x1
009aade0	bl 0x00c345e0
009aade4	sxtw x24,w23
009aade8	mov w2,#0x11a
009aadec	mov x0,x24
009aadf0	mov x1,x21
009aadf4	stp xzr,xzr,[x22]
009aadf8	bl 0x00c32320
009aadfc	cbz x0,0x009ab014
009aae00	ldr x8,[x19, #0x9a8]
009aae04	str x24,[x19, #0x310]
009aae08	str x0,[x19, #0x318]
009aae0c	mov x25,x0
009aae10	ldr x0,[x8]
009aae14	ldr x2,[x8, #0x440]
009aae18	mov w1,#0x4
009aae1c	bl 0x00c34ca0
009aae20	ldr x9,[x19, #0x9a8]
009aae24	mov x21,x0
009aae28	mov w1,#0x40
009aae2c	ldr x8,[x9]
009aae30	ldr x2,[x9, #0x440]
009aae34	mov x0,x8
009aae38	bl 0x00c34ca0
009aae3c	str x0,[sp, #0x18]
009aae40	bl 0x00c31fa0
009aae44	mov x22,x0
009aae48	bl 0x00c31fa0
009aae4c	mov x23,x0
009aae50	cbz x21,0x009ab054
009aae54	ldr x8,[sp, #0x18]
009aae58	cbz x8,0x009ab054
009aae5c	cbz x22,0x009ab054
009aae60	cbz x23,0x009ab054
009aae64	cmp w26,#0x1
009aae68	str x21,[sp, #0x10]
009aae6c	b.lt 0x009aafcc
009aae70	add x8,x19,#0x140
009aae74	str x8,[sp, #0x8]
009aae78	add x8,x19,#0x160
009aae7c	str x8,[sp]
009aae80	add w8,w28,w27
009aae84	add w8,w8,w20
009aae88	mov x21,xzr
009aae8c	mov x26,xzr
009aae90	lsl w27,w8,#0x1
009aae94	mov w28,#0x41
009aae98	cmp x26,#0x10
009aae9c	b.cs 0x009ab128
009aaea0	add x26,x26,#0x1
009aaea4	add x0,sp,#0x50
009aaea8	mov w1,w28
009aaeac	mov x2,x26
009aaeb0	bl 0x00c301c0
009aaeb4	ldr x1,[sp, #0x18]
009aaeb8	mov x0,x23
009aaebc	mov x2,xzr
009aaec0	bl 0x00c31f70
009aaec4	cbz w0,0x009ab094
009aaec8	add x1,sp,#0x50
009aaecc	mov x0,x23
009aaed0	mov x2,x26
009aaed4	bl 0x00c31f80
009aaed8	cbz w0,0x009ab094
009aaedc	ldr x8,[x19, #0x918]
009aaee0	mov x0,x23
009aaee4	ldr x2,[x8, #0x8]
009aaee8	add x1,x8,#0x50
009aaeec	bl 0x00c31f80
009aaef0	cbz w0,0x009ab094
009aaef4	ldr x1,[sp, #0x8]
009aaef8	mov w2,#0x20
009aaefc	mov x0,x23
009aaf00	bl 0x00c31f80
009aaf04	cbz w0,0x009ab094
009aaf08	ldr x1,[sp]
009aaf0c	mov w2,#0x20
009aaf10	mov x0,x23
009aaf14	bl 0x00c31f80
009aaf18	cbz w0,0x009ab094
009aaf1c	add x1,sp,#0x3c
009aaf20	mov x0,x23
009aaf24	mov x2,xzr
009aaf28	bl 0x00c31f60
009aaf2c	cbz w0,0x009ab094
009aaf30	ldr x1,[sp, #0x10]
009aaf34	mov x0,x22
009aaf38	mov x2,xzr
009aaf3c	bl 0x00c31f70
009aaf40	cbz w0,0x009ab094
009aaf44	ldr x8,[x19, #0x918]
009aaf48	mov x0,x22
009aaf4c	ldr x2,[x8, #0x8]
009aaf50	add x1,x8,#0x50
009aaf54	bl 0x00c31f80
009aaf58	cbz w0,0x009ab094
009aaf5c	add x1,sp,#0x3c
009aaf60	mov w2,#0x14
009aaf64	mov x0,x22
009aaf68	bl 0x00c31f80
009aaf6c	cbz w0,0x009ab094
009aaf70	add x20,x25,x21
009aaf74	add x21,x21,#0x10
009aaf78	cmp x21,x24
009aaf7c	b.le 0x009aafa8
009aaf80	add x1,sp,#0x3c
009aaf84	mov x0,x22
009aaf88	mov x2,xzr
009aaf8c	bl 0x00c31f60
009aaf90	cbz w0,0x009ab144
009aaf94	mov w2,w27
009aaf98	add x1,sp,#0x3c
009aaf9c	mov x0,x20
009aafa0	bl 0x00c2ffd0
009aafa4	b 0x009aafbc
009aafa8	mov x0,x22
009aafac	mov x1,x20
009aafb0	mov x2,xzr
009aafb4	bl 0x00c31f60
009aafb8	cbz w0,0x009ab160
009aafbc	add w28,w28,#0x1
009aafc0	cmp x21,x24
009aafc4	sub w27,w27,#0x10
009aafc8	b.lt 0x009aae98
009aafcc	add x0,sp,#0x3c
009aafd0	mov w1,#0x14
009aafd4	bl 0x00c34750
009aafd8	mov w20,#0x1
009aafdc	b 0x009ab0cc
009aafe0	mov w1,#0x50
009aafe4	mov x0,x19
009aafe8	bl 0x00c34c80
009aafec	mov w20,wzr
009aaff0	mov w0,w20
009aaff4	ldp x29,x30,[sp, #0xb0]
009aaff8	ldp x20,x19,[sp, #0xa0]
009aaffc	ldp x22,x21,[sp, #0x90]
009ab000	ldp x24,x23,[sp, #0x80]
009ab004	ldp x26,x25,[sp, #0x70]
009ab008	ldp x28,x27,[sp, #0x60]
009ab00c	add sp,sp,#0xc0
009ab010	ret
009ab014	bl 0x00c342a0
009ab018	adrp x0,0x2a3000
009ab01c	adrp x2,0x2bf000
009ab020	add x0,x0,#0xb34
009ab024	add x2,x2,#0x733
009ab028	mov w1,#0x11b
009ab02c	bl 0x00c342b0
009ab030	mov w8,#0x103
009ab034	movk w8,#0xc, LSL #16
009ab038	sub w2,w8,#0x3
009ab03c	mov w1,#0x50
009ab040	mov x0,x19
009ab044	mov x3,xzr
009ab048	bl 0x00c34410
009ab04c	mov w20,wzr
009ab050	b 0x009aaff0
009ab054	bl 0x00c342a0
009ab058	adrp x0,0x2a3000
009ab05c	adrp x2,0x2b7000
009ab060	add x0,x0,#0xb34
009ab064	add x2,x2,#0x5d0
009ab068	mov w1,#0x25
009ab06c	bl 0x00c342b0
009ab070	mov w8,#0x103
009ab074	movk w8,#0xc, LSL #16
009ab078	sub w2,w8,#0x3
009ab07c	mov w1,#0x50
009ab080	mov x0,x19
009ab084	mov x3,xzr
009ab088	bl 0x00c34410
009ab08c	mov w20,wzr
009ab090	b 0x009ab0d0
009ab094	bl 0x00c342a0
009ab098	adrp x0,0x2a3000
009ab09c	adrp x2,0x2b7000
009ab0a0	add x0,x0,#0xb34
009ab0a4	add x2,x2,#0x5d0
009ab0a8	mov w1,#0x3d
009ab0ac	bl 0x00c342b0
009ab0b0	mov w2,#0x103
009ab0b4	mov w1,#0x50
009ab0b8	movk w2,#0xc, LSL #16
009ab0bc	mov x0,x19
009ab0c0	mov x3,xzr
009ab0c4	bl 0x00c34410
009ab0c8	mov w20,wzr
009ab0cc	ldr x21,[sp, #0x10]
009ab0d0	mov x0,x22
009ab0d4	bl 0x00c31f90
009ab0d8	mov x0,x23
009ab0dc	bl 0x00c31f90
009ab0e0	mov x0,x21
009ab0e4	bl 0x00c34980
009ab0e8	ldr x0,[sp, #0x18]
009ab0ec	bl 0x00c34980
009ab0f0	ldrb w8,[x19, #0x9e9]
009ab0f4	tbnz w8,#0x3,0x009aaff0
009ab0f8	ldr x8,[x19, #0x918]
009ab0fc	mov w9,#0x1
009ab100	str w9,[x19, #0x180]
009ab104	ldr x8,[x8, #0x2f8]
009ab108	cbz x8,0x009aaff0
009ab10c	ldr w8,[x8, #0x24]
009ab110	cmp w8,#0x4
009ab114	b.eq 0x009ab120
009ab118	cmp w8,#0x20
009ab11c	b.ne 0x009aaff0
009ab120	str wzr,[x19, #0x180]
009ab124	b 0x009aaff0
009ab128	bl 0x00c342a0
009ab12c	adrp x0,0x2a3000
009ab130	adrp x2,0x2b7000
009ab134	add x0,x0,#0xb34
009ab138	add x2,x2,#0x5d0
009ab13c	mov w1,#0x2c
009ab140	b 0x009ab0ac
009ab144	bl 0x00c342a0
009ab148	adrp x0,0x2a3000
009ab14c	adrp x2,0x2b7000
009ab150	add x0,x0,#0xb34
009ab154	add x2,x2,#0x5d0
009ab158	mov w1,#0x42
009ab15c	b 0x009ab0ac
009ab160	bl 0x00c342a0
009ab164	adrp x0,0x2a3000
009ab168	adrp x2,0x2b7000
009ab16c	add x0,x0,#0xb34
009ab170	add x2,x2,#0x5d0
009ab174	mov w1,#0x48
009ab178	b 0x009ab0ac
