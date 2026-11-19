; mbedtls_poly1305_self_test @ 00b7b864
00b7b864	sub sp,sp,#0x60
00b7b868	str x23,[sp, #0x20]
00b7b86c	stp x22,x21,[sp, #0x30]
00b7b870	stp x20,x19,[sp, #0x40]
00b7b874	stp x29,x30,[sp, #0x50]
00b7b878	add x29,sp,#0x50
00b7b87c	mrs x23,tpidr_el0
00b7b880	ldr x8,[x23, #0x28]
00b7b884	mov w19,w0
00b7b888	str x8,[sp, #0x18]
00b7b88c	cbz w0,0x00b7b8a0
00b7b890	adrp x0,0x2a3000
00b7b894	add x0,x0,#0x379
00b7b898	mov w1,wzr
00b7b89c	bl 0x00c41af0
00b7b8a0	adrp x20,0x780000
00b7b8a4	adrp x21,0x780000
00b7b8a8	add x20,x20,#0x2a8
00b7b8ac	add x21,x21,#0x2e8
00b7b8b0	mov w2,#0x22
00b7b8b4	add x3,sp,#0x8
00b7b8b8	mov x0,x20
00b7b8bc	mov x1,x21
00b7b8c0	bl 0x00c42be0
00b7b8c4	adrp x22,0x780000
00b7b8c8	add x22,x22,#0x3e6
00b7b8cc	add x0,sp,#0x8
00b7b8d0	mov w2,#0x10
00b7b8d4	mov x1,x22
00b7b8d8	bl 0x00c300b0
00b7b8dc	cbnz w0,0x00b7b928
00b7b8e0	cbz w19,0x00b7b900
00b7b8e4	adrp x0,0x77c000
00b7b8e8	add x0,x0,#0x87c
00b7b8ec	bl 0x00c30760
00b7b8f0	adrp x0,0x2a3000
00b7b8f4	add x0,x0,#0x379
00b7b8f8	mov w1,#0x1
00b7b8fc	bl 0x00c41af0
00b7b900	add x0,x20,#0x20
00b7b904	add x1,x21,#0x7f
00b7b908	orr w2,wzr,#0x7f
00b7b90c	add x3,sp,#0x8
00b7b910	bl 0x00c42be0
00b7b914	add x1,x22,#0x10
00b7b918	add x0,sp,#0x8
00b7b91c	mov w2,#0x10
00b7b920	bl 0x00c300b0
00b7b924	cbz w0,0x00b7b964
00b7b928	cbz w19,0x00b7b938
00b7b92c	adrp x0,0x77c000
00b7b930	add x0,x0,#0x86c
00b7b934	bl 0x00c30760
00b7b938	mov w0,#0xffffffff
00b7b93c	ldr x8,[x23, #0x28]
00b7b940	ldr x9,[sp, #0x18]
00b7b944	cmp x8,x9
00b7b948	b.ne 0x00b7b984
00b7b94c	ldp x29,x30,[sp, #0x50]
00b7b950	ldp x20,x19,[sp, #0x40]
00b7b954	ldp x22,x21,[sp, #0x30]
00b7b958	ldr x23,[sp, #0x20]
00b7b95c	add sp,sp,#0x60
00b7b960	ret
00b7b964	cbz w19,0x00b7b97c
00b7b968	adrp x0,0x77c000
00b7b96c	add x0,x0,#0x87c
00b7b970	bl 0x00c30760
00b7b974	mov w0,#0xa
00b7b978	bl 0x00c42240
00b7b97c	mov w0,wzr
00b7b980	b 0x00b7b93c
00b7b984	bl 0x00c2fec0
