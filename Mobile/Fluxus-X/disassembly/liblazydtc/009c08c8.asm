; tls1_generate_master_secret @ 009c08c8
009c08c8	sub sp,sp,#0xf0
009c08cc	stp x22,x21,[sp, #0xc0]
009c08d0	stp x20,x19,[sp, #0xd0]
009c08d4	stp x29,x30,[sp, #0xe0]
009c08d8	ldr x8,[x0, #0x918]
009c08dc	str x23,[sp, #0xb0]
009c08e0	mov x19,x4
009c08e4	mov x22,x3
009c08e8	ldrb w8,[x8, #0x388]
009c08ec	mov x20,x2
009c08f0	mov x21,x0
009c08f4	mov x23,x1
009c08f8	add x29,sp,#0xe0
009c08fc	tbnz w8,#0x0,0x009c094c
009c0900	adrp x1,0x2bd000
009c0904	add x3,x21,#0x160
009c0908	add x7,x21,#0x140
009c090c	mov w8,#0x1
009c0910	orr w9,wzr,#0x30
009c0914	mov w10,#0x20
009c0918	add x1,x1,#0x649
009c091c	mov w2,#0xd
009c0920	mov w4,#0x20
009c0924	mov x0,x21
009c0928	mov x5,xzr
009c092c	mov x6,xzr
009c0930	stp x22,x23,[sp, #0x10]
009c0934	str w8,[sp, #0x28]
009c0938	str x9,[sp, #0x20]
009c093c	stp x10,x20,[sp]
009c0940	bl 0x009c0598
009c0944	cbnz w0,0x009c09c4
009c0948	b 0x009c09d8
009c094c	mov w1,#0x1
009c0950	mov x0,x21
009c0954	bl 0x00c345a0
009c0958	cbz w0,0x009c09d4
009c095c	add x1,sp,#0x30
009c0960	mov w2,#0x80
009c0964	sub x3,x29,#0x28
009c0968	mov x0,x21
009c096c	bl 0x00c35dc0
009c0970	cbz w0,0x009c09d4
009c0974	ldur x4,[x29, #-0x28]
009c0978	adrp x1,0x2cd000
009c097c	mov w8,#0x1
009c0980	orr w9,wzr,#0x30
009c0984	add x1,x1,#0x6d2
009c0988	mov w2,#0x16
009c098c	add x3,sp,#0x30
009c0990	mov x0,x21
009c0994	mov x5,xzr
009c0998	mov x6,xzr
009c099c	mov x7,xzr
009c09a0	stp x22,x23,[sp, #0x10]
009c09a4	str w8,[sp, #0x28]
009c09a8	str x9,[sp, #0x20]
009c09ac	stp xzr,x20,[sp]
009c09b0	bl 0x009c0598
009c09b4	cbz w0,0x009c09d4
009c09b8	ldur x1,[x29, #-0x28]
009c09bc	add x0,sp,#0x30
009c09c0	bl 0x00c34750
009c09c4	orr w8,wzr,#0x30
009c09c8	mov w0,#0x1
009c09cc	str x8,[x19]
009c09d0	b 0x009c09d8
009c09d4	mov w0,wzr
009c09d8	ldp x29,x30,[sp, #0xe0]
009c09dc	ldp x20,x19,[sp, #0xd0]
009c09e0	ldp x22,x21,[sp, #0xc0]
009c09e4	ldr x23,[sp, #0xb0]
009c09e8	add sp,sp,#0xf0
009c09ec	ret
