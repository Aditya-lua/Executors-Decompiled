; FUN_00b4e8bc @ 00b4e8bc
00b4e8bc	stp x20,x19,[sp, #-0x20]!
00b4e8c0	stp x29,x30,[sp, #0x10]
00b4e8c4	add x29,sp,#0x10
00b4e8c8	mov x20,x0
00b4e8cc	bl 0x00c41000
00b4e8d0	mov x19,xzr
00b4e8d4	cbz x20,0x00b4ea00
00b4e8d8	cbz w0,0x00b4ea00
00b4e8dc	ldr x0,[x20]
00b4e8e0	mov x1,xzr
00b4e8e4	bl 0x00c3a840
00b4e8e8	mov x19,x0
00b4e8ec	cbz x0,0x00b4ea00
00b4e8f0	ldr x8,[x20, #0x80]
00b4e8f4	cbz x8,0x00b4e93c
00b4e8f8	ldr x0,[x20, #0x10]
00b4e8fc	cbz x0,0x00b4e914
00b4e900	bl 0x00c3abf0
00b4e904	tbnz w0,#0x1f,0x00b4e9f4
00b4e908	mov w1,w0
00b4e90c	ldr x0,[x20, #0x80]
00b4e910	bl 0x00c3aaf0
00b4e914	ldr x0,[x20, #0x18]
00b4e918	cbz x0,0x00b4e948
00b4e91c	bl 0x00c3ad70
00b4e920	tbnz w0,#0x1f,0x00b4e9f4
00b4e924	mov w1,w0
00b4e928	ldr x0,[x20, #0x80]
00b4e92c	bl 0x00c3ab10
00b4e930	ldr x1,[x20, #0x80]
00b4e934	cbnz x1,0x00b4e950
00b4e938	b 0x00b4e964
00b4e93c	mov x0,x20
00b4e940	bl 0x00b4f5a8
00b4e944	cbz w0,0x00b4e9f4
00b4e948	ldr x1,[x20, #0x80]
00b4e94c	cbz x1,0x00b4e964
00b4e950	mov x0,x19
00b4e954	bl 0x00c3a880
00b4e958	cmp w0,#0x0
00b4e95c	cset w8,gt
00b4e960	b 0x00b4e994
00b4e964	bl 0x00c342a0
00b4e968	adrp x0,0x2c6000
00b4e96c	adrp x2,0x2ba000
00b4e970	add x0,x0,#0x737
00b4e974	add x2,x2,#0xb33
00b4e978	mov w1,#0x4d1
00b4e97c	bl 0x00c342b0
00b4e980	mov w0,#0x39
00b4e984	mov w1,#0xb1
00b4e988	mov x2,xzr
00b4e98c	bl 0x00c342c0
00b4e990	mov w8,wzr
00b4e994	ldrb w9,[x20, #0x78]
00b4e998	tst w9,#0x3
00b4e99c	b.eq 0x00b4e9b4
00b4e9a0	cbz w8,0x00b4e9b4
00b4e9a4	mov x0,x19
00b4e9a8	bl 0x00c3af80
00b4e9ac	cmp w0,#0x0
00b4e9b0	cset w8,ne
00b4e9b4	ldr w1,[x20, #0x7c]
00b4e9b8	cmn w1,#0x1
00b4e9bc	b.eq 0x00b4e9d4
00b4e9c0	cbz w8,0x00b4e9d4
00b4e9c4	mov x0,x19
00b4e9c8	bl 0x00c3ada0
00b4e9cc	cmp w0,#0x0
00b4e9d0	cset w8,ne
00b4e9d4	ldr x1,[x20, #0x20]
00b4e9d8	cbz x1,0x00b4e9f0
00b4e9dc	cbz w8,0x00b4e9f4
00b4e9e0	mov x0,x19
00b4e9e4	bl 0x00c3ad90
00b4e9e8	cmp w0,#0x0
00b4e9ec	cset w8,ne
00b4e9f0	cbnz w8,0x00b4ea00
00b4e9f4	mov x0,x19
00b4e9f8	bl 0x00c3a7c0
00b4e9fc	mov x19,xzr
00b4ea00	ldp x29,x30,[sp, #0x10]
00b4ea04	mov x0,x19
00b4ea08	ldp x20,x19,[sp], #0x20
00b4ea0c	ret
