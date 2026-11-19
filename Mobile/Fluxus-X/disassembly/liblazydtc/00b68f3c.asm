; mbedtls_base64_encode @ 00b68f3c
00b68f3c	cbz x4,0x00b68f78
00b68f40	orr x8,xzr,#-0x5555555555555556
00b68f44	movk x8,#0xaaab
00b68f48	umulh x8,x4,x8
00b68f4c	lsr x8,x8,#0x1
00b68f50	add x9,x8,x8, LSL #0x1
00b68f54	cmp x4,x9
00b68f58	cinc x10,x8,ne
00b68f5c	lsr x9,x10,#0x3e
00b68f60	cbz x9,0x00b68f84
00b68f64	mov x8,#-0x1
00b68f68	str x8,[x2]
00b68f6c	mov w8,#0xffffffd6
00b68f70	mov w0,w8
00b68f74	ret
00b68f78	mov w0,wzr
00b68f7c	str xzr,[x2]
00b68f80	ret
00b68f84	mov w9,#0x1
00b68f88	bfm x9,x10,#0x3e,#0x3d
00b68f8c	cbz x0,0x00b69278
00b68f90	cmp x9,x1
00b68f94	b.hi 0x00b69278
00b68f98	stp x26,x25,[sp, #-0x40]!
00b68f9c	stp x24,x23,[sp, #0x10]
00b68fa0	stp x22,x21,[sp, #0x20]
00b68fa4	stp x20,x19,[sp, #0x30]
00b68fa8	adds x9,x8,x8, LSL #0x1
00b68fac	b.eq 0x00b69288
00b68fb0	mov x8,xzr
00b68fb4	mov w10,#0x19
00b68fb8	mov w11,#0xffe6
00b68fbc	mov w12,#0x33
00b68fc0	mov w13,#0xffcc
00b68fc4	mov w14,#0x3d
00b68fc8	mov w15,#0xffc2
00b68fcc	orr w16,wzr,#0x3e
00b68fd0	mov w17,#0xffc1
00b68fd4	orr w18,wzr,#0x3f
00b68fd8	mov x1,x0
00b68fdc	add x5,x3,x8
00b68fe0	ldrb w22,[x5]
00b68fe4	ldrb w21,[x5, #0x1]
00b68fe8	ldrb w5,[x5, #0x2]
00b68fec	mov w6,#0x2b
00b68ff0	lsr w20,w22,#0x2
00b68ff4	lsr w7,w21,#0x4
00b68ff8	ubfx x23,x5,#0x6,#0x1a
00b68ffc	add w24,w20,#0x41
00b69000	mov x25,x20
00b69004	bfm w7,w22,#0x1c,#0x1
00b69008	mov x22,x20
00b6900c	add w26,w20,#0x47
00b69010	bfm w23,w21,#0x1e,#0x3
00b69014	mov x21,x20
00b69018	sub w25,w10,w25, UXTB 
00b6901c	and w22,w22,#0xff
00b69020	and w21,w21,#0xff
00b69024	bic w24,w24,w25, LSR #0x8
00b69028	add w25,w22,w11
00b6902c	sub w22,w12,w22
00b69030	orr w22,w25,w22
00b69034	add w25,w21,w13
00b69038	sub w21,w14,w21
00b6903c	orr w21,w25,w21
00b69040	sub w25,w20,#0x4
00b69044	bic w22,w26,w22, LSR #0x8
00b69048	mov x26,x20
00b6904c	and x25,x25,#0xff
00b69050	and w26,w26,#0xff
00b69054	and w20,w20,#0xff
00b69058	bic w21,w25,w21, LSR #0x8
00b6905c	add w25,w26,w15
00b69060	sub w26,w16,w26
00b69064	mov w19,#0x2f
00b69068	orr w25,w25,w26
00b6906c	add w26,w20,w17
00b69070	sub w20,w18,w20
00b69074	orr w22,w22,w24
00b69078	orr w20,w26,w20
00b6907c	bic w6,w6,w25, LSR #0x8
00b69080	orr w21,w22,w21
00b69084	bic w19,w19,w20, LSR #0x8
00b69088	orr w6,w21,w6
00b6908c	add w24,w7,#0x41
00b69090	mov x25,x7
00b69094	mov x22,x7
00b69098	orr w6,w6,w19
00b6909c	add w20,w7,#0x47
00b690a0	sub w21,w7,#0x4
00b690a4	mov x19,x7
00b690a8	strb w6,[x1]
00b690ac	mov x6,x7
00b690b0	and x21,x21,#0xff
00b690b4	sub w25,w10,w25, UXTB 
00b690b8	and w22,w22,#0xff
00b690bc	mov w26,#0x2b
00b690c0	and w19,w19,#0xff
00b690c4	bic w24,w24,w25, LSR #0x8
00b690c8	add w25,w22,w11
00b690cc	sub w22,w12,w22
00b690d0	and w6,w6,#0xff
00b690d4	orr w22,w25,w22
00b690d8	add w25,w19,w13
00b690dc	sub w19,w14,w19
00b690e0	and w7,w7,#0xff
00b690e4	orr w19,w25,w19
00b690e8	add w25,w6,w15
00b690ec	sub w6,w16,w6
00b690f0	bic w20,w20,w22, LSR #0x8
00b690f4	orr w6,w25,w6
00b690f8	add w25,w7,w17
00b690fc	sub w7,w18,w7
00b69100	mov w22,#0x2f
00b69104	bic w19,w21,w19, LSR #0x8
00b69108	orr w20,w20,w24
00b6910c	orr w7,w25,w7
00b69110	bic w6,w26,w6, LSR #0x8
00b69114	orr w19,w20,w19
00b69118	bic w7,w22,w7, LSR #0x8
00b6911c	orr w6,w19,w6
00b69120	add w25,w23,#0x41
00b69124	mov x22,x23
00b69128	mov x20,x23
00b6912c	orr w6,w6,w7
00b69130	add w24,w23,#0x47
00b69134	sub w19,w23,#0x4
00b69138	mov x7,x23
00b6913c	strb w6,[x1, #0x1]
00b69140	mov x6,x23
00b69144	and x19,x19,#0xff
00b69148	sub w22,w10,w22, UXTB 
00b6914c	and w20,w20,#0xff
00b69150	mov w21,#0x2b
00b69154	and w7,w7,#0xff
00b69158	bic w22,w25,w22, LSR #0x8
00b6915c	add w25,w20,w11
00b69160	sub w20,w12,w20
00b69164	and w6,w6,#0xff
00b69168	orr w20,w25,w20
00b6916c	add w25,w7,w13
00b69170	sub w7,w14,w7
00b69174	and w23,w23,#0xff
00b69178	orr w7,w25,w7
00b6917c	add w25,w6,w15
00b69180	sub w6,w16,w6
00b69184	bic w20,w24,w20, LSR #0x8
00b69188	orr w6,w25,w6
00b6918c	add w25,w23,w17
00b69190	sub w23,w18,w23
00b69194	mov w24,#0x2f
00b69198	bic w7,w19,w7, LSR #0x8
00b6919c	orr w20,w20,w22
00b691a0	orr w23,w25,w23
00b691a4	bic w6,w21,w6, LSR #0x8
00b691a8	orr w7,w20,w7
00b691ac	and x5,x5,#0x3f
00b691b0	bic w23,w24,w23, LSR #0x8
00b691b4	orr w6,w7,w6
00b691b8	add w21,w5,#0x41
00b691bc	mov x24,x5
00b691c0	mov x20,x5
00b691c4	orr w6,w6,w23
00b691c8	add w22,w5,#0x47
00b691cc	sub w7,w5,#0x4
00b691d0	mov x23,x5
00b691d4	strb w6,[x1, #0x2]
00b691d8	mov x6,x5
00b691dc	and x7,x7,#0xff
00b691e0	sub w24,w10,w24, UXTB 
00b691e4	and w20,w20,#0xff
00b691e8	mov w19,#0x2b
00b691ec	and w23,w23,#0xff
00b691f0	bic w21,w21,w24, LSR #0x8
00b691f4	add w24,w20,w11
00b691f8	sub w20,w12,w20
00b691fc	and w6,w6,#0xff
00b69200	orr w20,w24,w20
00b69204	add w24,w23,w13
00b69208	sub w23,w14,w23
00b6920c	and w5,w5,#0xff
00b69210	orr w23,w24,w23
00b69214	add w24,w6,w15
00b69218	sub w6,w16,w6
00b6921c	bic w20,w22,w20, LSR #0x8
00b69220	orr w6,w24,w6
00b69224	add w24,w5,w17
00b69228	sub w5,w18,w5
00b6922c	mov w22,#0x2f
00b69230	bic w7,w7,w23, LSR #0x8
00b69234	orr w20,w20,w21
00b69238	orr w24,w24,w5
00b6923c	bic w6,w19,w6, LSR #0x8
00b69240	orr w7,w20,w7
00b69244	bic w19,w22,w24, LSR #0x8
00b69248	orr w6,w7,w6
00b6924c	add x5,x1,#0x4
00b69250	add x8,x8,#0x3
00b69254	orr w6,w6,w19
00b69258	cmp x8,x9
00b6925c	strb w6,[x1, #0x3]
00b69260	mov x1,x5
00b69264	b.cc 0x00b68fdc
00b69268	add x10,x3,x8
00b6926c	cmp x8,x4
00b69270	b.cc 0x00b6929c
00b69274	b 0x00b694e8
00b69278	mov w8,#0xffffffd6
00b6927c	mov w0,w8
00b69280	str x9,[x2]
00b69284	ret
00b69288	mov x8,xzr
00b6928c	mov x10,x3
00b69290	mov x5,x0
00b69294	cmp x8,x4
00b69298	b.cs 0x00b694e8
00b6929c	ldrb w1,[x3, x8]
00b692a0	add x3,x8,#0x1
00b692a4	cmp x3,x4
00b692a8	mov w9,wzr
00b692ac	b.cs 0x00b692b4
00b692b0	ldrb w9,[x10, #0x1]
00b692b4	lsr w17,w1,#0x2
00b692b8	lsr w19,w9,#0x4
00b692bc	cmp x3,x4
00b692c0	add w3,w17,#0x41
00b692c4	mov x4,x17
00b692c8	mov x21,x17
00b692cc	mov w10,#0x19
00b692d0	add w20,w17,#0x47
00b692d4	bfm w19,w1,#0x1c,#0x1
00b692d8	mov x1,x17
00b692dc	mov w11,#0xffe6
00b692e0	mov w12,#0x33
00b692e4	sub w4,w10,w4, UXTB 
00b692e8	and w21,w21,#0xff
00b692ec	mov w13,#0xffcc
00b692f0	mov w8,#0x3d
00b692f4	and w1,w1,#0xff
00b692f8	bic w3,w3,w4, LSR #0x8
00b692fc	add w4,w21,w11
00b69300	sub w21,w12,w21
00b69304	orr w4,w4,w21
00b69308	add w21,w1,w13
00b6930c	sub w1,w8,w1
00b69310	orr w1,w21,w1
00b69314	sub w21,w17,#0x4
00b69318	bic w4,w20,w4, LSR #0x8
00b6931c	mov x20,x17
00b69320	and x21,x21,#0xff
00b69324	mov w7,#0x2b
00b69328	mov w14,#0xffc2
00b6932c	orr w15,wzr,#0x3e
00b69330	and w20,w20,#0xff
00b69334	mov w16,#0xffc1
00b69338	orr w18,wzr,#0x3f
00b6933c	and w17,w17,#0xff
00b69340	bic w1,w21,w1, LSR #0x8
00b69344	add w21,w20,w14
00b69348	sub w20,w15,w20
00b6934c	orr w20,w21,w20
00b69350	add w21,w17,w16
00b69354	sub w17,w18,w17
00b69358	orr w17,w21,w17
00b6935c	mov w21,#0x2f
00b69360	orr w3,w4,w3
00b69364	bic w7,w7,w20, LSR #0x8
00b69368	orr w1,w3,w1
00b6936c	bic w17,w21,w17, LSR #0x8
00b69370	orr w1,w1,w7
00b69374	add w4,w19,#0x41
00b69378	mov x20,x19
00b6937c	mov x3,x19
00b69380	orr w17,w1,w17
00b69384	add w21,w19,#0x47
00b69388	sub w7,w19,#0x4
00b6938c	mov x1,x19
00b69390	strb w17,[x5]
00b69394	mov x17,x19
00b69398	and x7,x7,#0xff
00b6939c	sub w20,w10,w20, UXTB 
00b693a0	and w3,w3,#0xff
00b693a4	mov w6,#0x2b
00b693a8	and w1,w1,#0xff
00b693ac	bic w4,w4,w20, LSR #0x8
00b693b0	add w20,w3,w11
00b693b4	sub w3,w12,w3
00b693b8	and w17,w17,#0xff
00b693bc	orr w3,w20,w3
00b693c0	add w20,w1,w13
00b693c4	sub w1,w8,w1
00b693c8	and w19,w19,#0xff
00b693cc	orr w1,w20,w1
00b693d0	add w20,w17,w14
00b693d4	sub w17,w15,w17
00b693d8	orr w17,w20,w17
00b693dc	add w20,w19,w16
00b693e0	sub w19,w18,w19
00b693e4	bic w3,w21,w3, LSR #0x8
00b693e8	orr w19,w20,w19
00b693ec	mov w20,#0x2f
00b693f0	bic w1,w7,w1, LSR #0x8
00b693f4	orr w3,w3,w4
00b693f8	bic w17,w6,w17, LSR #0x8
00b693fc	orr w1,w3,w1
00b69400	bic w6,w20,w19, LSR #0x8
00b69404	orr w17,w1,w17
00b69408	orr w17,w17,w6
00b6940c	strb w17,[x5, #0x1]
00b69410	mov w17,#0x3d
00b69414	b.cs 0x00b694d8
00b69418	ubfiz w17,w9,#0x2,#0x4
00b6941c	mov w1,#0x41
00b69420	bfm w1,w9,#0x1e,#0x3
00b69424	mov x9,x17
00b69428	sub w9,w10,w9, UXTB 
00b6942c	mov x10,x17
00b69430	and w10,w10,#0xff
00b69434	add w11,w10,w11
00b69438	sub w10,w12,w10
00b6943c	add w3,w17,#0x47
00b69440	orr w10,w11,w10
00b69444	mov x11,x17
00b69448	and w11,w11,#0xff
00b6944c	sub w12,w17,#0x4
00b69450	add w13,w11,w13
00b69454	sub w11,w8,w11
00b69458	orr w11,w13,w11
00b6945c	mov x13,x17
00b69460	and x12,x12,#0xfc
00b69464	and w13,w13,#0xff
00b69468	add w14,w13,w14
00b6946c	sub w13,w15,w13
00b69470	mov w15,#0x2b
00b69474	and w17,w17,#0xff
00b69478	lsr w9,w9,#0x8
00b6947c	lsr w10,w10,#0x8
00b69480	add w16,w17,w16
00b69484	sub w17,w18,w17
00b69488	eor w9,w9,#0xff
00b6948c	lsr w11,w11,#0x8
00b69490	orr w13,w14,w13
00b69494	eor w10,w10,#0xff
00b69498	and w9,w9,w1
00b6949c	orr w14,w16,w17
00b694a0	eor w11,w11,#0xff
00b694a4	lsr w13,w13,#0x8
00b694a8	and w10,w10,w3
00b694ac	mov w18,#0x2f
00b694b0	lsr w14,w14,#0x8
00b694b4	and w11,w11,w12
00b694b8	eor w12,w13,#0xff
00b694bc	orr w9,w10,w9
00b694c0	eor w13,w14,#0xff
00b694c4	and w10,w12,w15
00b694c8	orr w9,w9,w11
00b694cc	orr w9,w9,w10
00b694d0	and w10,w13,w18
00b694d4	orr w17,w9,w10
00b694d8	add x9,x5,#0x4
00b694dc	strb w17,[x5, #0x2]
00b694e0	strb w8,[x5, #0x3]
00b694e4	mov x5,x9
00b694e8	sub x9,x5,x0
00b694ec	str x9,[x2]
00b694f0	strb wzr,[x5]
00b694f4	ldp x20,x19,[sp, #0x30]
00b694f8	ldp x22,x21,[sp, #0x20]
00b694fc	ldp x24,x23,[sp, #0x10]
00b69500	ldp x26,x25,[sp], #0x40
00b69504	mov w0,wzr
00b69508	ret
