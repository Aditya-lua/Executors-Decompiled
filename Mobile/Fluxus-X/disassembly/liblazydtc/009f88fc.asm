; FUN_009f88fc @ 009f88fc
009f88fc	sub sp,sp,#0x50
009f8900	stp x22,x21,[sp, #0x20]
009f8904	stp x20,x19,[sp, #0x30]
009f8908	stp x29,x30,[sp, #0x40]
009f890c	stp xzr,x1,[sp, #0x10]
009f8910	str wzr,[sp, #0xc]
009f8914	ldr x19,[x0]
009f8918	mov x20,x5
009f891c	mov w21,w2
009f8920	add x29,sp,#0x40
009f8924	cbnz x19,0x009f894c
009f8928	adrp x1,0x2db000
009f892c	mov x22,x0
009f8930	add x1,x1,#0xdbc
009f8934	mov w0,#0x8
009f8938	orr w2,wzr,#0x1f
009f893c	bl 0x00c34250
009f8940	mov x19,x0
009f8944	str x0,[x22]
009f8948	cbz x0,0x009f89ec
009f894c	cbz w21,0x009f89a0
009f8950	sxtw x3,w21
009f8954	add x0,sp,#0x10
009f8958	add x1,sp,#0xc
009f895c	add x2,sp,#0x18
009f8960	bl 0x00c37610
009f8964	cbz w0,0x009f8a20
009f8968	ldr x9,[x20, #0x28]
009f896c	ldr w8,[sp, #0xc]
009f8970	tbnz w9,#0x1,0x009f89b0
009f8974	cbz w8,0x009f89b0
009f8978	bl 0x00c342a0
009f897c	adrp x0,0x2db000
009f8980	adrp x2,0x2cf000
009f8984	add x0,x0,#0xdbc
009f8988	add x2,x2,#0x92f
009f898c	mov w1,#0xc8
009f8990	bl 0x00c342b0
009f8994	mov w0,#0xd
009f8998	mov w1,#0xe2
009f899c	b 0x009f8a14
009f89a0	mov x8,xzr
009f89a4	mov w0,#0x1
009f89a8	str w8,[x19]
009f89ac	b 0x009f8a20
009f89b0	cbz w8,0x009f8a34
009f89b4	ldr x8,[sp, #0x10]
009f89b8	orr w9,wzr,#0x80000001
009f89bc	cmp x8,x9
009f89c0	b.cc 0x009f8a90
009f89c4	bl 0x00c342a0
009f89c8	adrp x0,0x2db000
009f89cc	adrp x2,0x2cf000
009f89d0	add x0,x0,#0xdbc
009f89d4	add x2,x2,#0x92f
009f89d8	mov w1,#0xcd
009f89dc	bl 0x00c342b0
009f89e0	mov w0,#0xd
009f89e4	orr w1,wzr,#0xe0
009f89e8	b 0x009f8a14
009f89ec	bl 0x00c342a0
009f89f0	adrp x0,0x2db000
009f89f4	adrp x2,0x2a2000
009f89f8	add x0,x0,#0xdbc
009f89fc	add x2,x2,#0x180
009f8a00	mov w1,#0x20
009f8a04	bl 0x00c342b0
009f8a08	mov w1,#0x100
009f8a0c	mov w0,#0xd
009f8a10	movk w1,#0xc, LSL #16
009f8a14	mov x2,xzr
009f8a18	bl 0x00c342c0
009f8a1c	mov w0,wzr
009f8a20	ldp x29,x30,[sp, #0x40]
009f8a24	ldp x20,x19,[sp, #0x30]
009f8a28	ldp x22,x21,[sp, #0x20]
009f8a2c	add sp,sp,#0x50
009f8a30	ret
009f8a34	ldr x8,[sp, #0x10]
009f8a38	tst x9,#0x2
009f8a3c	cset w10,eq
009f8a40	lsr x11,x8,#0x1f
009f8a44	lsr x12,x8,#0x20
009f8a48	cmp x11,#0x0
009f8a4c	cset w11,ne
009f8a50	cmp x12,#0x0
009f8a54	and w11,w11,w9, LSR #0x1
009f8a58	cset w9,ne
009f8a5c	tbnz w11,#0x0,0x009f8a68
009f8a60	and w9,w10,w9
009f8a64	cbz w9,0x009f89a4
009f8a68	bl 0x00c342a0
009f8a6c	adrp x0,0x2db000
009f8a70	adrp x2,0x2cf000
009f8a74	add x0,x0,#0xdbc
009f8a78	add x2,x2,#0x92f
009f8a7c	mov w1,#0xd4
009f8a80	bl 0x00c342b0
009f8a84	mov w0,#0xd
009f8a88	mov w1,#0xdf
009f8a8c	b 0x009f8a14
009f8a90	neg x8,x8
009f8a94	str x8,[sp, #0x10]
009f8a98	b 0x009f89a4
