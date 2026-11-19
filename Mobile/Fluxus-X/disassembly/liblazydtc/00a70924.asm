; evp_pkey_get_params_to_ctrl @ 00a70924
00a70924	sub sp,sp,#0x120
00a70928	str x28,[sp, #0xd0]
00a7092c	stp x24,x23,[sp, #0xe0]
00a70930	stp x22,x21,[sp, #0xf0]
00a70934	stp x20,x19,[sp, #0x100]
00a70938	stp x29,x30,[sp, #0x110]
00a7093c	add x29,sp,#0x110
00a70940	cbz x1,0x00a70a00
00a70944	ldr x8,[x1]
00a70948	mov x20,x1
00a7094c	mov w19,#0x1
00a70950	cbz x8,0x00a70a14
00a70954	adrp x22,0xc60000
00a70958	adrp x23,0x2b9000
00a7095c	mov x21,x0
00a70960	add x22,x22,#0x308
00a70964	add x23,x23,#0xe99
00a70968	add x0,sp,#0x40
00a7096c	mov w2,#0x90
00a70970	mov w1,wzr
00a70974	bl 0x00c301c0
00a70978	movi v0.2D,#0x0
00a7097c	stp q0,q0,[sp]
00a70980	stp q0,q0,[sp, #0x20]
00a70984	str w19,[sp]
00a70988	ldr x8,[x20]
00a7098c	mov x0,sp
00a70990	mov w2,#0x27
00a70994	mov x1,x22
00a70998	str x8,[sp, #0x28]
00a7099c	bl 0x00a70be0
00a709a0	cbz x0,0x00a70a08
00a709a4	ldr w9,[x0]
00a709a8	ldr x8,[x0, #0x38]
00a709ac	mov x1,x0
00a709b0	str x21,[sp, #0x60]
00a709b4	str w9,[sp, #0x48]
00a709b8	str x20,[sp, #0x70]
00a709bc	cbz x8,0x00a70a10
00a709c0	cmp w9,#0x1
00a709c4	b.ne 0x00a70a10
00a709c8	add x2,sp,#0x40
00a709cc	mov w0,wzr
00a709d0	blr x8
00a709d4	ldr x8,[sp, #0xb8]
00a709d8	mov w24,w0
00a709dc	cbz x8,0x00a709f0
00a709e0	mov w2,#0x2cb
00a709e4	mov x0,x8
00a709e8	mov x1,x23
00a709ec	bl 0x00c32310
00a709f0	ldr x8,[x20, #0x28]!
00a709f4	cbnz x8,0x00a70968
00a709f8	mov w19,w24
00a709fc	b 0x00a70a14
00a70a00	mov w19,#0x1
00a70a04	b 0x00a70a14
00a70a08	str x21,[sp, #0x60]
00a70a0c	str x20,[sp, #0x70]
00a70a10	orr w19,wzr,#0xfffffffe
00a70a14	mov w0,w19
00a70a18	ldp x29,x30,[sp, #0x110]
00a70a1c	ldp x20,x19,[sp, #0x100]
00a70a20	ldp x22,x21,[sp, #0xf0]
00a70a24	ldp x24,x23,[sp, #0xe0]
00a70a28	ldr x28,[sp, #0xd0]
00a70a2c	add sp,sp,#0x120
00a70a30	ret
