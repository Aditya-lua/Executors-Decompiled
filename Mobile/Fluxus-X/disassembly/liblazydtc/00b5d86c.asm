; FUN_00b5d86c @ 00b5d86c
00b5d86c	sub sp,sp,#0x70
00b5d870	str x21,[sp, #0x40]
00b5d874	stp x20,x19,[sp, #0x50]
00b5d878	stp x29,x30,[sp, #0x60]
00b5d87c	add x29,sp,#0x60
00b5d880	mov x19,x2
00b5d884	mov x21,x1
00b5d888	mov x20,x0
00b5d88c	bl 0x00c41000
00b5d890	cbz w0,0x00b5d9d0
00b5d894	cbz x21,0x00b5d8c8
00b5d898	ldrb w8,[x21]
00b5d89c	cbz w8,0x00b5d8c8
00b5d8a0	bl 0x00c342a0
00b5d8a4	adrp x0,0x2c6000
00b5d8a8	adrp x2,0x2a3000
00b5d8ac	add x0,x0,#0x7b7
00b5d8b0	add x2,x2,#0x248
00b5d8b4	mov w1,#0x63
00b5d8b8	bl 0x00c342b0
00b5d8bc	mov w0,#0x39
00b5d8c0	mov w1,#0x7a
00b5d8c4	b 0x00b5d974
00b5d8c8	cbz x19,0x00b5d91c
00b5d8cc	mov x0,x19
00b5d8d0	bl 0x00c3b2a0
00b5d8d4	cbz w0,0x00b5d94c
00b5d8d8	add x1,x20,#0x10
00b5d8dc	add x0,sp,#0x8
00b5d8e0	mov w2,#0x100
00b5d8e4	str xzr,[x20, #0x118]
00b5d8e8	bl 0x00c3e870
00b5d8ec	ldr w8,[x19, #0x60]
00b5d8f0	cmp w8,#0x3
00b5d8f4	b.eq 0x00b5d984
00b5d8f8	cmp w8,#0x2
00b5d8fc	b.ne 0x00b5d9e4
00b5d900	cbz w0,0x00b5d9c0
00b5d904	add x0,sp,#0x8
00b5d908	mov w1,#0xffffffff
00b5d90c	mov x2,x19
00b5d910	bl 0x00c41850
00b5d914	cbnz w0,0x00b5d99c
00b5d918	b 0x00b5d9c0
00b5d91c	ldr x8,[x20, #0x8]
00b5d920	cbnz x8,0x00b5d9cc
00b5d924	bl 0x00c342a0
00b5d928	adrp x0,0x2c6000
00b5d92c	adrp x2,0x2a3000
00b5d930	add x0,x0,#0x7b7
00b5d934	add x2,x2,#0x248
00b5d938	mov w1,#0x6b
00b5d93c	bl 0x00c342b0
00b5d940	mov w0,#0x39
00b5d944	mov w1,#0x72
00b5d948	b 0x00b5d974
00b5d94c	bl 0x00c342a0
00b5d950	adrp x0,0x2c6000
00b5d954	adrp x2,0x2a3000
00b5d958	add x0,x0,#0x7b7
00b5d95c	add x2,x2,#0x248
00b5d960	orr w1,wzr,#0x70
00b5d964	bl 0x00c342b0
00b5d968	mov w1,#0x103
00b5d96c	mov w0,#0x39
00b5d970	movk w1,#0xc, LSL #16
00b5d974	mov x2,xzr
00b5d978	bl 0x00c342c0
00b5d97c	mov w0,wzr
00b5d980	b 0x00b5d9d0
00b5d984	cbz w0,0x00b5d9c0
00b5d988	add x0,sp,#0x8
00b5d98c	mov w1,#0xffffffff
00b5d990	mov x2,x19
00b5d994	bl 0x00c41860
00b5d998	cbz w0,0x00b5d9c0
00b5d99c	add x0,sp,#0x8
00b5d9a0	bl 0x00c34360
00b5d9a4	cbz w0,0x00b5d9c0
00b5d9a8	add x1,x20,#0x118
00b5d9ac	add x0,sp,#0x8
00b5d9b0	bl 0x00c34370
00b5d9b4	add x0,sp,#0x8
00b5d9b8	bl 0x00c36c50
00b5d9bc	str x0,[x20, #0x110]
00b5d9c0	add x0,sp,#0x8
00b5d9c4	bl 0x00c34340
00b5d9c8	str x19,[x20, #0x8]
00b5d9cc	mov w0,#0x1
00b5d9d0	ldp x29,x30,[sp, #0x60]
00b5d9d4	ldp x20,x19,[sp, #0x50]
00b5d9d8	ldr x21,[sp, #0x40]
00b5d9dc	add sp,sp,#0x70
00b5d9e0	ret
00b5d9e4	bl 0x00c342a0
00b5d9e8	adrp x0,0x2c6000
00b5d9ec	adrp x2,0x2a3000
00b5d9f0	add x0,x0,#0x7b7
00b5d9f4	add x2,x2,#0x248
00b5d9f8	mov w1,#0x86
00b5d9fc	bl 0x00c342b0
00b5da00	mov w1,#0x103
00b5da04	mov w0,#0x39
00b5da08	movk w1,#0xc, LSL #16
00b5da0c	mov x2,xzr
00b5da10	bl 0x00c342c0
00b5da14	mov x0,x19
00b5da18	bl 0x00c3b270
00b5da1c	b 0x00b5d97c
