; EVP_DigestFinalXOF @ 00a581b4
00a581b4	sub sp,sp,#0xb0
00a581b8	stp x29,x30,[sp, #0xa0]
00a581bc	add x29,sp,#0xa0
00a581c0	stp x20,x19,[sp, #0x90]
00a581c4	stur x2,[x29, #-0x18]
00a581c8	ldr x8,[x0, #0x8]
00a581cc	cbz x8,0x00a582a8
00a581d0	ldr x9,[x8, #0x70]
00a581d4	mov x19,x0
00a581d8	mov x20,x1
00a581dc	cbz x9,0x00a582d0
00a581e0	ldr x8,[x8, #0xa0]
00a581e4	cbz x8,0x00a5836c
00a581e8	adrp x0,0x2b4000
00a581ec	add x0,x0,#0x231
00a581f0	add x8,sp,#0x8
00a581f4	sub x1,x29,#0x18
00a581f8	bl 0x00c36270
00a581fc	ldr x8,[sp, #0x28]
00a58200	ldur q0,[sp, #0x18]
00a58204	ldur q1,[sp, #0x8]
00a58208	str x8,[sp, #0x50]
00a5820c	add x8,sp,#0x8
00a58210	stp q1,q0,[sp, #0x30]
00a58214	bl 0x00c34c40
00a58218	ldr x8,[sp, #0x28]
00a5821c	ldur q0,[sp, #0x18]
00a58220	ldur q1,[sp, #0x8]
00a58224	str x8,[sp, #0x78]
00a58228	stur q0,[sp, #0x68]
00a5822c	stur q1,[sp, #0x58]
00a58230	ldr x8,[x19, #0x28]
00a58234	cbz x8,0x00a58260
00a58238	ldr w9,[x8]
00a5823c	cmp w9,#0x100
00a58240	b.eq 0x00a5824c
00a58244	cmp w9,#0x80
00a58248	b.ne 0x00a58260
00a5824c	ldr x0,[x8, #0x30]
00a58250	cbz x0,0x00a58260
00a58254	ldr x8,[x8, #0x28]
00a58258	ldr x8,[x8, #0xe8]
00a5825c	cbnz x8,0x00a58274
00a58260	ldr x8,[x19, #0x8]
00a58264	cbz x8,0x00a58398
00a58268	ldr x8,[x8, #0xc8]
00a5826c	cbz x8,0x00a58398
00a58270	ldr x0,[x19, #0x38]
00a58274	add x1,sp,#0x30
00a58278	blr x8
00a5827c	cmp w0,#0x1
00a58280	b.lt 0x00a58398
00a58284	ldr x8,[x19, #0x8]
00a58288	ldr x0,[x19, #0x38]
00a5828c	ldur x3,[x29, #-0x18]
00a58290	sub x2,x29,#0x18
00a58294	ldr x8,[x8, #0xa0]
00a58298	mov x1,x20
00a5829c	blr x8
00a582a0	mov w20,w0
00a582a4	b 0x00a5839c
00a582a8	bl 0x00c342a0
00a582ac	adrp x0,0x2b7000
00a582b0	adrp x2,0x2a7000
00a582b4	add x0,x0,#0xc61
00a582b8	add x2,x2,#0xf47
00a582bc	orr w1,wzr,#0x1e0
00a582c0	bl 0x00c342b0
00a582c4	orr w0,wzr,#0x6
00a582c8	mov w1,#0xda
00a582cc	b 0x00a58390
00a582d0	lsr x9,x2,#0x1f
00a582d4	cbnz x9,0x00a58344
00a582d8	ldr x9,[x8, #0x10]
00a582dc	tbz w9,#0x1,0x00a58344
00a582e0	ldr x8,[x8, #0x50]
00a582e4	orr w1,wzr,#0x3
00a582e8	mov x0,x19
00a582ec	mov x3,xzr
00a582f0	blr x8
00a582f4	cbz w0,0x00a58344
00a582f8	ldr x8,[x19, #0x8]
00a582fc	mov x0,x19
00a58300	mov x1,x20
00a58304	ldr x8,[x8, #0x30]
00a58308	blr x8
00a5830c	ldr x8,[x19, #0x8]
00a58310	mov w20,w0
00a58314	ldr x9,[x8, #0x40]
00a58318	cbz x9,0x00a58334
00a5831c	mov x0,x19
00a58320	blr x9
00a58324	mov w1,#0x2
00a58328	mov x0,x19
00a5832c	bl 0x00c3c1b0
00a58330	ldr x8,[x19, #0x8]
00a58334	ldr x0,[x19, #0x20]
00a58338	ldrsw x1,[x8, #0x4c]
00a5833c	bl 0x00c34750
00a58340	b 0x00a5839c
00a58344	bl 0x00c342a0
00a58348	adrp x0,0x2b7000
00a5834c	adrp x2,0x2a7000
00a58350	add x0,x0,#0xc61
00a58354	add x2,x2,#0xf47
00a58358	orr w1,wzr,#0x1ff
00a5835c	bl 0x00c342b0
00a58360	orr w0,wzr,#0x6
00a58364	mov w1,#0xb2
00a58368	b 0x00a58390
00a5836c	bl 0x00c342a0
00a58370	adrp x0,0x2b7000
00a58374	adrp x2,0x2a7000
00a58378	add x0,x0,#0xc61
00a5837c	add x2,x2,#0xf47
00a58380	mov w1,#0x1e8
00a58384	bl 0x00c342b0
00a58388	orr w0,wzr,#0x6
00a5838c	mov w1,#0xbc
00a58390	mov x2,xzr
00a58394	bl 0x00c342c0
00a58398	mov w20,wzr
00a5839c	mov w0,w20
00a583a0	ldp x29,x30,[sp, #0xa0]
00a583a4	ldp x20,x19,[sp, #0x90]
00a583a8	add sp,sp,#0xb0
00a583ac	ret
