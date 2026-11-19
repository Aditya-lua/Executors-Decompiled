; FUN_00ab100c @ 00ab100c
00ab100c	sub sp,sp,#0x50
00ab1010	cmp w2,#0x1
00ab1014	mov w8,#0x10
00ab1018	str x21,[sp, #0x20]
00ab101c	csel w21,w8,w2,lt
00ab1020	stp x20,x19,[sp, #0x30]
00ab1024	mov x20,x1
00ab1028	mov x19,x0
00ab102c	mov w2,#0x4
00ab1030	mov w0,wzr
00ab1034	mov w1,w21
00ab1038	stp x29,x30,[sp, #0x40]
00ab103c	add x29,sp,#0x40
00ab1040	bl 0x00c376b0
00ab1044	str w0,[sp, #0x8]
00ab1048	tbnz w0,#0x1f,0x00ab109c
00ab104c	adrp x1,0x2a2000
00ab1050	sxtw x0,w0
00ab1054	add x1,x1,#0xaf7
00ab1058	mov w2,#0x106
00ab105c	bl 0x00c32320
00ab1060	str x0,[sp, #0x10]
00ab1064	cbz x0,0x00ab10d8
00ab1068	stur x0,[x29, #-0x18]
00ab106c	sub x0,x29,#0x18
00ab1070	mov w3,#0x4
00ab1074	mov w1,wzr
00ab1078	mov w2,w21
00ab107c	mov w4,wzr
00ab1080	bl 0x00c376c0
00ab1084	ldur x0,[x29, #-0x18]
00ab1088	cbz x20,0x00ab10a4
00ab108c	sxtw x2,w21
00ab1090	mov x1,x20
00ab1094	bl 0x00c2ffd0
00ab1098	b 0x00ab10b4
00ab109c	mov w19,wzr
00ab10a0	b 0x00ab10f0
00ab10a4	mov w1,w21
00ab10a8	bl 0x00c326a0
00ab10ac	cmp w0,#0x1
00ab10b0	b.lt 0x00ab10d8
00ab10b4	mov w1,#0x16e
00ab10b8	add x2,sp,#0x8
00ab10bc	mov w4,#0x2
00ab10c0	mov x0,x19
00ab10c4	mov w3,wzr
00ab10c8	bl 0x00c3efa0
00ab10cc	cmp w0,#0x0
00ab10d0	cset w19,gt
00ab10d4	b 0x00ab10dc
00ab10d8	mov w19,wzr
00ab10dc	ldr x0,[sp, #0x10]
00ab10e0	adrp x1,0x2a2000
00ab10e4	add x1,x1,#0xaf7
00ab10e8	mov w2,#0x114
00ab10ec	bl 0x00c32310
00ab10f0	mov w0,w19
00ab10f4	ldp x29,x30,[sp, #0x40]
00ab10f8	ldp x20,x19,[sp, #0x30]
00ab10fc	ldr x21,[sp, #0x20]
00ab1100	add sp,sp,#0x50
00ab1104	ret
