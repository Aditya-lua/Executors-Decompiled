; FUN_00b3f8ec @ 00b3f8ec
00b3f8ec	sub sp,sp,#0x60
00b3f8f0	mov w3,#0xffffffff
00b3f8f4	stp x22,x21,[sp, #0x30]
00b3f8f8	stp x20,x19,[sp, #0x40]
00b3f8fc	stp x29,x30,[sp, #0x50]
00b3f900	str xzr,[sp, #0x10]
00b3f904	str w3,[sp, #0xc]
00b3f908	ldr w9,[x6, #0xc]
00b3f90c	str x23,[sp, #0x20]
00b3f910	mov x23,x6
00b3f914	mov x20,x5
00b3f918	mov x8,x4
00b3f91c	mov w21,w2
00b3f920	mov x22,x1
00b3f924	mov x19,x0
00b3f928	add x29,sp,#0x50
00b3f92c	cbz w9,0x00b3f964
00b3f930	str xzr,[sp, #0x28]
00b3f934	str w3,[sp, #0x1c]
00b3f938	cbz x8,0x00b3f990
00b3f93c	ldr w2,[x23, #0x8]
00b3f940	add x3,sp,#0x28
00b3f944	add x4,sp,#0x1c
00b3f948	mov x0,x22
00b3f94c	mov w1,w21
00b3f950	blr x8
00b3f954	cbz w0,0x00b3f9c4
00b3f958	ldr x2,[sp, #0x28]
00b3f95c	ldr w3,[sp, #0x1c]
00b3f960	b 0x00b3f994
00b3f964	cbz x8,0x00b3f9dc
00b3f968	ldr w2,[x23, #0x8]
00b3f96c	add x3,sp,#0x10
00b3f970	add x4,sp,#0xc
00b3f974	mov x0,x22
00b3f978	mov w1,w21
00b3f97c	blr x8
00b3f980	cbz w0,0x00b3f9c4
00b3f984	ldr x2,[sp, #0x10]
00b3f988	ldr w3,[sp, #0xc]
00b3f98c	b 0x00b3f9e4
00b3f990	mov x2,xzr
00b3f994	mov x0,x22
00b3f998	mov w1,w21
00b3f99c	mov x4,x20
00b3f9a0	mov x5,x23
00b3f9a4	bl 0x00b3f48c
00b3f9a8	mov x20,x0
00b3f9ac	cbz x0,0x00b3f9cc
00b3f9b0	mov x0,x19
00b3f9b4	mov x1,x20
00b3f9b8	bl 0x00c3f280
00b3f9bc	mov w19,w0
00b3f9c0	b 0x00b3f9d0
00b3f9c4	mov w19,wzr
00b3f9c8	b 0x00b3fa44
00b3f9cc	mov w19,wzr
00b3f9d0	mov x0,x20
00b3f9d4	bl 0x00c382f0
00b3f9d8	b 0x00b3fa44
00b3f9dc	mov x2,xzr
00b3f9e0	mov w3,#0xffffffff
00b3f9e4	mov x0,x22
00b3f9e8	mov w1,w21
00b3f9ec	mov x4,x20
00b3f9f0	bl 0x00b3f5b8
00b3f9f4	mov x20,x0
00b3f9f8	cbz x0,0x00b3fa10
00b3f9fc	mov x0,x19
00b3fa00	mov x1,x20
00b3fa04	bl 0x00c3f2a0
00b3fa08	mov w19,w0
00b3fa0c	b 0x00b3fa3c
00b3fa10	ldr w8,[sp, #0xc]
00b3fa14	ldr x0,[sp, #0x10]
00b3fa18	cmp w8,#0x10
00b3fa1c	b.eq 0x00b3fa34
00b3fa20	cmp w8,#0x6
00b3fa24	mov w19,wzr
00b3fa28	b.ne 0x00b3fa3c
00b3fa2c	bl 0x00c37660
00b3fa30	b 0x00b3fa38
00b3fa34	bl 0x00c37890
00b3fa38	mov w19,wzr
00b3fa3c	mov x0,x20
00b3fa40	bl 0x00c37d00
00b3fa44	mov w0,w19
00b3fa48	ldp x29,x30,[sp, #0x50]
00b3fa4c	ldp x20,x19,[sp, #0x40]
00b3fa50	ldp x22,x21,[sp, #0x30]
00b3fa54	ldr x23,[sp, #0x20]
00b3fa58	add sp,sp,#0x60
00b3fa5c	ret
