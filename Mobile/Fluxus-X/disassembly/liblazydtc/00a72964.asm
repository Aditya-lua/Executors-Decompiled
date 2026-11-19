; FUN_00a72964 @ 00a72964
00a72964	sub sp,sp,#0x80
00a72968	stp x22,x21,[sp, #0x50]
00a7296c	stp x20,x19,[sp, #0x60]
00a72970	stp x29,x30,[sp, #0x70]
00a72974	ldr x8,[x2, #0x20]
00a72978	mov w21,w0
00a7297c	add x29,sp,#0x70
00a72980	mov x19,x2
00a72984	mov x0,x8
00a72988	mov x20,x1
00a7298c	bl 0x00c37cd0
00a72990	cmp w0,#0x6
00a72994	b.eq 0x00a729ac
00a72998	ldr x0,[x19, #0x20]
00a7299c	bl 0x00c37cd0
00a729a0	cmp w0,#0x390
00a729a4	mov w0,wzr
00a729a8	b.ne 0x00a72a0c
00a729ac	ldr x0,[x19, #0x20]
00a729b0	bl 0x00c3d8d0
00a729b4	mov x22,x0
00a729b8	bl 0x00c3db80
00a729bc	cmp w0,#0x3
00a729c0	b.cc 0x00a72a08
00a729c4	mov x1,sp
00a729c8	mov x0,x22
00a729cc	bl 0x00c3db40
00a729d0	cbz w0,0x00a72a08
00a729d4	ldr x8,[sp, #0x10]
00a729d8	cbz x8,0x00a72a08
00a729dc	ldr x9,[x19, #0x30]
00a729e0	mov w0,wzr
00a729e4	ldr w9,[x9, #0x8]
00a729e8	cmp w9,#0x2
00a729ec	b.ne 0x00a72a0c
00a729f0	mov w0,w21
00a729f4	mov x1,x20
00a729f8	mov x2,x19
00a729fc	str x8,[x19, #0x20]
00a72a00	bl 0x00a6fd84
00a72a04	b 0x00a72a0c
00a72a08	mov w0,wzr
00a72a0c	ldp x29,x30,[sp, #0x70]
00a72a10	ldp x20,x19,[sp, #0x60]
00a72a14	ldp x22,x21,[sp, #0x50]
00a72a18	add sp,sp,#0x80
00a72a1c	ret
