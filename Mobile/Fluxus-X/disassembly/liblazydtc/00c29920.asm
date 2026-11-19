; __cxa_rethrow_primary_exception @ 00c29920
00c29920	paciasp
00c29924	stp x29,x30,[sp, #-0x30]!
00c29928	stp x22,x21,[sp, #0x10]
00c2992c	stp x20,x19,[sp, #0x20]
00c29930	mov x29,sp
00c29934	cbz x0,0x00c29a24
00c29938	mov x20,x0
00c2993c	mov w0,#0x80
00c29940	bl 0x00c29b0c
00c29944	cbz x0,0x00c29a38
00c29948	movi v0.2D,#0x0
00c2994c	mov x22,#0x2b00
00c29950	mov x21,x0
00c29954	movk x22,#0x432b, LSL #16
00c29958	mov x19,x0
00c2995c	sub x1,x20,#0x78
00c29960	movk x22,#0x4e47, LSL #32
00c29964	movk x22,#0x434c, LSL #48
00c29968	str q0,[x0, #0x70]
00c2996c	stp q0,q0,[x0]
00c29970	stp q0,q0,[x0, #0x20]
00c29974	stp q0,q0,[x0, #0x40]
00c29978	str q0,[x21, #0x60]!
00c2997c	str x20,[x0, #0x8]
00c29980	mov w0,#0x1
00c29984	bl 0x00c2bd10
00c29988	ldur x8,[x20, #-0x70]
00c2998c	str x8,[x19, #0x10]
00c29990	bl 0x00c44740
00c29994	str x0,[x19, #0x20]
00c29998	bl 0x00c44750
00c2999c	orr x8,x22,#0x1
00c299a0	str x0,[x19, #0x28]
00c299a4	str x8,[x21]
00c299a8	bl 0x00c44720
00c299ac	ldr w9,[x0, #0x8]
00c299b0	nop
00c299b4	adr x8,0xc29a40
00c299b8	str x8,[x19, #0x68]
00c299bc	add w9,w9,#0x1
00c299c0	str w9,[x0, #0x8]
00c299c4	mov x0,x21
00c299c8	bl 0x00c2bd40
00c299cc	ldr x20,[x21]
00c299d0	bl 0x00c44720
00c299d4	and x8,x20,#-0x100
00c299d8	cmp x8,x22
00c299dc	b.ne 0x00c29a18
00c299e0	ldr w9,[x19, #0x38]
00c299e4	ldr x8,[x0]
00c299e8	cmp w9,#0x0
00c299ec	cneg w9,w9,mi
00c299f0	cmp x19,x8
00c299f4	add w9,w9,#0x1
00c299f8	str w9,[x19, #0x38]
00c299fc	b.eq 0x00c29a08
00c29a00	str x8,[x19, #0x30]
00c29a04	str x19,[x0]
00c29a08	ldr w8,[x0, #0x8]
00c29a0c	sub w8,w8,#0x1
00c29a10	str w8,[x0, #0x8]
00c29a14	b 0x00c29a24
00c29a18	ldr x8,[x0]
00c29a1c	cbnz x8,0x00c29a38
00c29a20	str x19,[x0]
00c29a24	ldp x20,x19,[sp, #0x20]
00c29a28	ldp x22,x21,[sp, #0x10]
00c29a2c	ldp x29,x30,[sp], #0x30
00c29a30	autiasp
00c29a34	ret
00c29a38	bl 0x00c2fff0
