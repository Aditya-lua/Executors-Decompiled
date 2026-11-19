; FUN_00b9f930 @ 00b9f930
00b9f930	sub sp,sp,#0x80
00b9f934	stp x28,x27,[sp, #0x20]
00b9f938	stp x26,x25,[sp, #0x30]
00b9f93c	stp x24,x23,[sp, #0x40]
00b9f940	stp x22,x21,[sp, #0x50]
00b9f944	stp x20,x19,[sp, #0x60]
00b9f948	stp x29,x30,[sp, #0x70]
00b9f94c	add x29,sp,#0x70
00b9f950	mrs x21,tpidr_el0
00b9f954	ldr x8,[x21, #0x28]
00b9f958	mov w19,w0
00b9f95c	mov w0,w6
00b9f960	mov w22,w7
00b9f964	mov w20,w6
00b9f968	mov x28,x5
00b9f96c	mov x24,x4
00b9f970	mov w26,w3
00b9f974	mov x23,x2
00b9f978	mov x27,x1
00b9f97c	str x8,[sp, #0x18]
00b9f980	bl 0x00c30270
00b9f984	mov x25,x0
00b9f988	cbz x0,0x00b9fa0c
00b9f98c	sxtw x26,w26
00b9f990	sxtw x22,w22
00b9f994	str x28,[sp]
00b9f998	cbz w19,0x00b9f9b0
00b9f99c	adrp x0,0x2b8000
00b9f9a0	add x0,x0,#0xc1a
00b9f9a4	mov w2,#0x1
00b9f9a8	mov x1,x27
00b9f9ac	bl 0x00c41af0
00b9f9b0	ldr w4,[x24]
00b9f9b4	adrp x3,0x787000
00b9f9b8	add x3,x3,#0x840
00b9f9bc	add x5,sp,#0x8
00b9f9c0	mov x0,x25
00b9f9c4	mov x1,x23
00b9f9c8	mov x2,x26
00b9f9cc	bl 0x00c42420
00b9f9d0	mov w8,#0xffff9f80
00b9f9d4	mov w28,w0
00b9f9d8	cmp w0,w8
00b9f9dc	b.eq 0x00b9f9ec
00b9f9e0	cbz w28,0x00b9fa14
00b9f9e4	cmn w28,#0x72
00b9f9e8	b.ne 0x00b9fc04
00b9f9ec	cmp w20,#0x24
00b9f9f0	b.eq 0x00b9f9fc
00b9f9f4	cmp w20,#0x3
00b9f9f8	b.ne 0x00b9fc04
00b9f9fc	cbz w19,0x00b9fa50
00b9fa00	adrp x0,0x77c000
00b9fa04	add x0,x0,#0x884
00b9fa08	b 0x00b9fa38
00b9fa0c	mov w28,#0xffff9f80
00b9fa10	b 0x00b9fc14
00b9fa14	ldr x1,[sp]
00b9fa18	add x0,sp,#0x8
00b9fa1c	mov x2,x22
00b9fa20	bl 0x00c300b0
00b9fa24	mov w28,w0
00b9fa28	cbnz w0,0x00b9fc04
00b9fa2c	cbz w19,0x00b9fa50
00b9fa30	adrp x0,0x77c000
00b9fa34	add x0,x0,#0x87c
00b9fa38	bl 0x00c30760
00b9fa3c	adrp x0,0x2b8000
00b9fa40	add x0,x0,#0xc1a
00b9fa44	mov w2,#0x2
00b9fa48	mov x1,x27
00b9fa4c	bl 0x00c41af0
00b9fa50	ldr w4,[x24, #0x4]
00b9fa54	adrp x3,0x787000
00b9fa58	add x3,x3,#0x840
00b9fa5c	add x5,sp,#0x8
00b9fa60	mov x0,x25
00b9fa64	mov x1,x23
00b9fa68	mov x2,x26
00b9fa6c	bl 0x00c42420
00b9fa70	mov w8,#0xffff9f80
00b9fa74	mov w28,w0
00b9fa78	cmp w0,w8
00b9fa7c	b.eq 0x00b9fa8c
00b9fa80	cbz w28,0x00b9faac
00b9fa84	cmn w28,#0x72
00b9fa88	b.ne 0x00b9fc04
00b9fa8c	cmp w20,#0x24
00b9fa90	b.eq 0x00b9fa9c
00b9fa94	cmp w20,#0x3
00b9fa98	b.ne 0x00b9fc04
00b9fa9c	cbz w19,0x00b9faec
00b9faa0	adrp x0,0x77c000
00b9faa4	add x0,x0,#0x884
00b9faa8	b 0x00b9fad4
00b9faac	ldr x8,[sp]
00b9fab0	add x0,sp,#0x8
00b9fab4	mov x2,x22
00b9fab8	add x1,x8,x22
00b9fabc	bl 0x00c300b0
00b9fac0	mov w28,w0
00b9fac4	cbnz w0,0x00b9fc04
00b9fac8	cbz w19,0x00b9faec
00b9facc	adrp x0,0x77c000
00b9fad0	add x0,x0,#0x87c
00b9fad4	bl 0x00c30760
00b9fad8	adrp x0,0x2b8000
00b9fadc	add x0,x0,#0xc1a
00b9fae0	orr w2,wzr,#0x3
00b9fae4	mov x1,x27
00b9fae8	bl 0x00c41af0
00b9faec	ldr w4,[x24, #0x8]
00b9faf0	adrp x3,0x787000
00b9faf4	add x3,x3,#0x840
00b9faf8	add x5,sp,#0x8
00b9fafc	mov x0,x25
00b9fb00	mov x1,x23
00b9fb04	mov x2,x26
00b9fb08	bl 0x00c42420
00b9fb0c	mov w8,#0xffff9f80
00b9fb10	mov w28,w0
00b9fb14	cmp w0,w8
00b9fb18	b.eq 0x00b9fb28
00b9fb1c	cbz w28,0x00b9fb48
00b9fb20	cmn w28,#0x72
00b9fb24	b.ne 0x00b9fc04
00b9fb28	cmp w20,#0x24
00b9fb2c	b.eq 0x00b9fb38
00b9fb30	cmp w20,#0x3
00b9fb34	b.ne 0x00b9fc04
00b9fb38	cbz w19,0x00b9fb88
00b9fb3c	adrp x0,0x77c000
00b9fb40	add x0,x0,#0x884
00b9fb44	b 0x00b9fb70
00b9fb48	ldr x8,[sp]
00b9fb4c	add x0,sp,#0x8
00b9fb50	mov x2,x22
00b9fb54	add x1,x8,x22, LSL #0x1
00b9fb58	bl 0x00c300b0
00b9fb5c	mov w28,w0
00b9fb60	cbnz w0,0x00b9fc04
00b9fb64	cbz w19,0x00b9fb88
00b9fb68	adrp x0,0x77c000
00b9fb6c	add x0,x0,#0x87c
00b9fb70	bl 0x00c30760
00b9fb74	adrp x0,0x2b8000
00b9fb78	add x0,x0,#0xc1a
00b9fb7c	mov w2,#0x4
00b9fb80	mov x1,x27
00b9fb84	bl 0x00c41af0
00b9fb88	ldr w4,[x24, #0xc]
00b9fb8c	adrp x3,0x787000
00b9fb90	add x3,x3,#0x840
00b9fb94	add x5,sp,#0x8
00b9fb98	mov x0,x25
00b9fb9c	mov x1,x23
00b9fba0	mov x2,x26
00b9fba4	bl 0x00c42420
00b9fba8	mov w8,#0xffff9f80
00b9fbac	mov w28,w0
00b9fbb0	cmp w0,w8
00b9fbb4	b.eq 0x00b9fbc4
00b9fbb8	cbz w28,0x00b9fbe4
00b9fbbc	cmn w28,#0x72
00b9fbc0	b.ne 0x00b9fc04
00b9fbc4	cmp w20,#0x24
00b9fbc8	b.eq 0x00b9fbd4
00b9fbcc	cmp w20,#0x3
00b9fbd0	b.ne 0x00b9fc04
00b9fbd4	cbz w19,0x00b9fc58
00b9fbd8	adrp x0,0x77c000
00b9fbdc	add x0,x0,#0x884
00b9fbe0	b 0x00b9fc54
00b9fbe4	ldr x9,[sp]
00b9fbe8	add x8,x22,x22, LSL #0x1
00b9fbec	add x0,sp,#0x8
00b9fbf0	mov x2,x22
00b9fbf4	add x1,x9,x8
00b9fbf8	bl 0x00c300b0
00b9fbfc	mov w28,w0
00b9fc00	cbz w0,0x00b9fc48
00b9fc04	cbz w19,0x00b9fc14
00b9fc08	adrp x0,0x77c000
00b9fc0c	add x0,x0,#0x854
00b9fc10	bl 0x00c30760
00b9fc14	ldr x8,[x21, #0x28]
00b9fc18	ldr x9,[sp, #0x18]
00b9fc1c	cmp x8,x9
00b9fc20	b.ne 0x00b9fc60
00b9fc24	mov w0,w28
00b9fc28	ldp x29,x30,[sp, #0x70]
00b9fc2c	ldp x20,x19,[sp, #0x60]
00b9fc30	ldp x22,x21,[sp, #0x50]
00b9fc34	ldp x24,x23,[sp, #0x40]
00b9fc38	ldp x26,x25,[sp, #0x30]
00b9fc3c	ldp x28,x27,[sp, #0x20]
00b9fc40	add sp,sp,#0x80
00b9fc44	ret
00b9fc48	cbz w19,0x00b9fc58
00b9fc4c	adrp x0,0x77c000
00b9fc50	add x0,x0,#0x87c
00b9fc54	bl 0x00c30760
00b9fc58	mov w28,wzr
00b9fc5c	b 0x00b9fc14
00b9fc60	bl 0x00c2fec0
