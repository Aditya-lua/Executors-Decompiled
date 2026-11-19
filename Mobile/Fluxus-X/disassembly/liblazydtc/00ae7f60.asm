; SRP_create_verifier_ex @ 00ae7f60
00ae7f60	stp x28,x27,[sp, #-0x60]!
00ae7f64	stp x26,x25,[sp, #0x10]
00ae7f68	stp x24,x23,[sp, #0x20]
00ae7f6c	stp x22,x21,[sp, #0x30]
00ae7f70	stp x20,x19,[sp, #0x40]
00ae7f74	stp x29,x30,[sp, #0x50]
00ae7f78	add x29,sp,#0x50
00ae7f7c	sub sp,sp,#0x1, LSL #12
00ae7f80	sub sp,sp,#0x3b0
00ae7f84	mov w26,wzr
00ae7f88	mov x19,xzr
00ae7f8c	mov x20,xzr
00ae7f90	stp xzr,xzr,[x29, #-0x68]
00ae7f94	cbz x0,0x00ae8038
00ae7f98	mov x27,x1
00ae7f9c	cbz x1,0x00ae8038
00ae7fa0	mov x23,x2
00ae7fa4	cbz x2,0x00ae8038
00ae7fa8	mov x22,x3
00ae7fac	mov x24,x20
00ae7fb0	mov x21,x19
00ae7fb4	cbz x3,0x00ae8198
00ae7fb8	mov x25,x5
00ae7fbc	mov x28,x0
00ae7fc0	mov x26,x6
00ae7fc4	str x7,[sp, #0x8]
00ae7fc8	cbz x4,0x00ae8044
00ae7fcc	add x0,sp,#0x9d4
00ae7fd0	mov x1,x4
00ae7fd4	bl 0x00ae8258
00ae7fd8	cmp w0,#0x1
00ae7fdc	b.lt 0x00ae8088
00ae7fe0	mov w1,w0
00ae7fe4	add x0,sp,#0x9d4
00ae7fe8	mov x2,xzr
00ae7fec	bl 0x00c36970
00ae7ff0	mov x19,x0
00ae7ff4	cbz x0,0x00ae8098
00ae7ff8	add x0,sp,#0x9d4
00ae7ffc	mov x1,x25
00ae8000	bl 0x00ae8258
00ae8004	cmp w0,#0x1
00ae8008	b.lt 0x00ae8098
00ae800c	mov w1,w0
00ae8010	add x0,sp,#0x9d4
00ae8014	mov x2,xzr
00ae8018	bl 0x00c36970
00ae801c	mov x24,x0
00ae8020	cbz x0,0x00ae81f8
00ae8024	adrp x20,0x2c8000
00ae8028	add x20,x20,#0xdbd
00ae802c	str x19,[sp]
00ae8030	mov x21,x24
00ae8034	b 0x00ae8064
00ae8038	mov x24,x20
00ae803c	mov x21,x19
00ae8040	b 0x00ae8198
00ae8044	mov x0,x25
00ae8048	bl 0x00c36a70
00ae804c	cbz x0,0x00ae8088
00ae8050	ldp x24,x8,[x0, #0x8]
00ae8054	ldr x20,[x0]
00ae8058	mov x19,xzr
00ae805c	mov x21,xzr
00ae8060	str x8,[sp]
00ae8064	ldr x1,[x23]
00ae8068	mov x0,x26
00ae806c	cbz x1,0x00ae80a8
00ae8070	add x0,sp,#0x10
00ae8074	bl 0x00ae8258
00ae8078	mov w25,w0
00ae807c	cmp w0,#0x1
00ae8080	b.ge 0x00ae80c4
00ae8084	b 0x00ae818c
00ae8088	mov x20,xzr
00ae808c	mov x24,xzr
00ae8090	mov x19,xzr
00ae8094	b 0x00ae80a0
00ae8098	mov x20,xzr
00ae809c	mov x24,xzr
00ae80a0	mov x21,xzr
00ae80a4	b 0x00ae8194
00ae80a8	add x1,sp,#0x10
00ae80ac	mov w2,#0x14
00ae80b0	mov w3,wzr
00ae80b4	mov w25,#0x14
00ae80b8	bl 0x00c347b0
00ae80bc	cmp w0,#0x1
00ae80c0	b.lt 0x00ae818c
00ae80c4	add x0,sp,#0x10
00ae80c8	mov w1,w25
00ae80cc	mov x2,xzr
00ae80d0	bl 0x00c36970
00ae80d4	stur x0,[x29, #-0x60]
00ae80d8	cbz x0,0x00ae818c
00ae80dc	ldp x4,x7,[sp]
00ae80e0	sub x2,x29,#0x60
00ae80e4	sub x3,x29,#0x68
00ae80e8	mov x0,x28
00ae80ec	mov x1,x27
00ae80f0	mov x5,x24
00ae80f4	mov x6,x26
00ae80f8	bl 0x00ae83b8
00ae80fc	cbz w0,0x00ae818c
00ae8100	ldur x0,[x29, #-0x68]
00ae8104	add x1,sp,#0x9d4
00ae8108	bl 0x00c36980
00ae810c	tbnz w0,#0x1f,0x00ae818c
00ae8110	ldur x0,[x29, #-0x68]
00ae8114	bl 0x00c322f0
00ae8118	add w8,w0,#0x7
00ae811c	add w9,w0,#0xe
00ae8120	cmp w8,#0x0
00ae8124	csel w8,w9,w8,lt
00ae8128	asr w8,w8,#0x3
00ae812c	lsl w26,w8,#0x1
00ae8130	adrp x1,0x2ce000
00ae8134	sxtw x0,w26
00ae8138	add x1,x1,#0x365
00ae813c	mov w2,#0x29c
00ae8140	bl 0x00c32320
00ae8144	mov x24,x0
00ae8148	cbz x0,0x00ae8234
00ae814c	ldur x0,[x29, #-0x68]
00ae8150	bl 0x00c322f0
00ae8154	add w8,w0,#0x7
00ae8158	add w9,w0,#0xe
00ae815c	cmp w8,#0x0
00ae8160	csel w8,w9,w8,lt
00ae8164	asr w2,w8,#0x3
00ae8168	add x1,sp,#0x9d4
00ae816c	mov x0,x24
00ae8170	bl 0x00ae8568
00ae8174	cbz w0,0x00ae8234
00ae8178	ldr x8,[x23]
00ae817c	cbz x8,0x00ae8200
00ae8180	str x24,[x22]
00ae8184	mov x24,xzr
00ae8188	b 0x00ae8198
00ae818c	mov x20,xzr
00ae8190	mov x24,xzr
00ae8194	mov w26,wzr
00ae8198	mov x0,x19
00ae819c	bl 0x00c36290
00ae81a0	mov x0,x21
00ae81a4	bl 0x00c36290
00ae81a8	adrp x2,0x2ce000
00ae81ac	sxtw x1,w26
00ae81b0	add x2,x2,#0x365
00ae81b4	mov w3,#0x2b5
00ae81b8	mov x0,x24
00ae81bc	bl 0x00c345e0
00ae81c0	ldur x0,[x29, #-0x60]
00ae81c4	bl 0x00c322e0
00ae81c8	ldur x0,[x29, #-0x68]
00ae81cc	bl 0x00c322e0
00ae81d0	mov x0,x20
00ae81d4	add sp,sp,#0x1, LSL #12
00ae81d8	add sp,sp,#0x3b0
00ae81dc	ldp x29,x30,[sp, #0x50]
00ae81e0	ldp x20,x19,[sp, #0x40]
00ae81e4	ldp x22,x21,[sp, #0x30]
00ae81e8	ldp x24,x23,[sp, #0x20]
00ae81ec	ldp x26,x25,[sp, #0x10]
00ae81f0	ldp x28,x27,[sp], #0x60
00ae81f4	ret
00ae81f8	mov x20,xzr
00ae81fc	b 0x00ae80a0
00ae8200	adrp x1,0x2ce000
00ae8204	add x1,x1,#0x365
00ae8208	mov w0,#0x28
00ae820c	mov w2,#0x2a4
00ae8210	bl 0x00c32320
00ae8214	cbz x0,0x00ae8234
00ae8218	add x1,sp,#0x10
00ae821c	mov w2,#0x14
00ae8220	mov x25,x0
00ae8224	bl 0x00ae8568
00ae8228	cbz w0,0x00ae823c
00ae822c	str x25,[x23]
00ae8230	b 0x00ae8180
00ae8234	mov x20,xzr
00ae8238	b 0x00ae8198
00ae823c	adrp x1,0x2ce000
00ae8240	add x1,x1,#0x365
00ae8244	mov w2,#0x2a8
00ae8248	mov x0,x25
00ae824c	bl 0x00c32310
00ae8250	mov x20,xzr
00ae8254	b 0x00ae8198
