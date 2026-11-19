; OBJ_NAME_cleanup @ 00aad934
00aad934	str x21,[sp, #-0x30]!
00aad938	stp x20,x19,[sp, #0x10]
00aad93c	stp x29,x30,[sp, #0x20]
00aad940	adrp x21,0xd22000
00aad944	ldr x8,[x21, #0x178]
00aad948	add x29,sp,#0x20
00aad94c	cbz x8,0x00aad9d4
00aad950	adrp x9,0xd22000
00aad954	mov w19,w0
00aad958	str w0,[x9, #0x180]
00aad95c	mov x0,x8
00aad960	bl 0x00c36020
00aad964	ldr x8,[x21, #0x178]
00aad968	mov x20,x0
00aad96c	mov x1,xzr
00aad970	mov x0,x8
00aad974	bl 0x00c36030
00aad978	ldr x0,[x21, #0x178]
00aad97c	adrp x1,0xaad000
00aad980	add x1,x1,#0x9e4
00aad984	bl 0x00c395e0
00aad988	ldr x0,[x21, #0x178]
00aad98c	tbnz w19,#0x1f,0x00aad9a4
00aad990	mov x1,x20
00aad994	ldp x29,x30,[sp, #0x20]
00aad998	ldp x20,x19,[sp, #0x10]
00aad99c	ldr x21,[sp], #0x30
00aad9a0	b 0x00c36030
00aad9a4	bl 0x00c34db0
00aad9a8	adrp x19,0xd22000
00aad9ac	ldr x0,[x19, #0x170]
00aad9b0	adrp x1,0xaad000
00aad9b4	add x1,x1,#0xa10
00aad9b8	bl 0x00c32600
00aad9bc	adrp x20,0xd22000
00aad9c0	ldr x0,[x20, #0x168]
00aad9c4	bl 0x00c34d40
00aad9c8	str xzr,[x21, #0x178]
00aad9cc	str xzr,[x19, #0x170]
00aad9d0	str xzr,[x20, #0x168]
00aad9d4	ldp x29,x30,[sp, #0x20]
00aad9d8	ldp x20,x19,[sp, #0x10]
00aad9dc	ldr x21,[sp], #0x30
00aad9e0	ret
