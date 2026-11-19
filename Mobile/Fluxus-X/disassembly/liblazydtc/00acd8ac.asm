; ossl_rsa_pss_to_ctx @ 00acd8ac
00acd8ac	sub sp,sp,#0x60
00acd8b0	stp x22,x21,[sp, #0x30]
00acd8b4	stp x20,x19,[sp, #0x40]
00acd8b8	stp x29,x30,[sp, #0x50]
00acd8bc	str x1,[sp, #0x28]
00acd8c0	stp xzr,xzr,[sp, #0x10]
00acd8c4	ldr x8,[x2]
00acd8c8	mov x22,x0
00acd8cc	add x29,sp,#0x50
00acd8d0	mov x20,x3
00acd8d4	mov x0,x8
00acd8d8	mov x19,x2
00acd8dc	mov x21,x1
00acd8e0	bl 0x00c37750
00acd8e4	cmp w0,#0x390
00acd8e8	b.ne 0x00acd930
00acd8ec	mov x0,x19
00acd8f0	bl 0x00c3fb30
00acd8f4	add x1,sp,#0x10
00acd8f8	add x2,sp,#0x18
00acd8fc	add x3,sp,#0x24
00acd900	mov x19,x0
00acd904	bl 0x00acda58
00acd908	cbz w0,0x00acd964
00acd90c	cbz x20,0x00acd994
00acd910	ldr x2,[sp, #0x10]
00acd914	add x1,sp,#0x28
00acd918	mov x0,x22
00acd91c	mov x3,xzr
00acd920	mov x4,x20
00acd924	bl 0x00c3b2b0
00acd928	cbnz w0,0x00acd9c8
00acd92c	b 0x00acda0c
00acd930	bl 0x00c342a0
00acd934	adrp x0,0x2aa000
00acd938	adrp x2,0x2ac000
00acd93c	add x0,x0,#0x8f8
00acd940	add x2,x2,#0x797
00acd944	mov w1,#0x215
00acd948	bl 0x00c342b0
00acd94c	mov w0,#0x4
00acd950	mov w1,#0x9b
00acd954	mov x2,xzr
00acd958	bl 0x00c342c0
00acd95c	mov w20,#0xffffffff
00acd960	b 0x00acda18
00acd964	bl 0x00c342a0
00acd968	adrp x0,0x2aa000
00acd96c	adrp x2,0x2ac000
00acd970	add x0,x0,#0x8f8
00acd974	add x2,x2,#0x797
00acd978	mov w1,#0x21c
00acd97c	bl 0x00c342b0
00acd980	mov w0,#0x4
00acd984	mov w1,#0x95
00acd988	mov x2,xzr
00acd98c	bl 0x00c342c0
00acd990	b 0x00acda0c
00acd994	add x1,sp,#0x8
00acd998	mov x0,x21
00acd99c	bl 0x00c3dc30
00acd9a0	cmp w0,#0x1
00acd9a4	b.lt 0x00acda0c
00acd9a8	ldr x0,[sp, #0x10]
00acd9ac	bl 0x00c34c30
00acd9b0	ldr x8,[sp, #0x8]
00acd9b4	mov w20,w0
00acd9b8	mov x0,x8
00acd9bc	bl 0x00c34c30
00acd9c0	cmp w20,w0
00acd9c4	b.ne 0x00acda30
00acd9c8	ldr x0,[sp, #0x28]
00acd9cc	orr w1,wzr,#0x6
00acd9d0	bl 0x00c37100
00acd9d4	cmp w0,#0x1
00acd9d8	b.lt 0x00acda0c
00acd9dc	ldr x0,[sp, #0x28]
00acd9e0	ldr w1,[sp, #0x24]
00acd9e4	bl 0x00c37110
00acd9e8	cmp w0,#0x1
00acd9ec	mov w20,#0xffffffff
00acd9f0	b.lt 0x00acda10
00acd9f4	ldr x0,[sp, #0x28]
00acd9f8	ldr x1,[sp, #0x18]
00acd9fc	bl 0x00c3fa30
00acda00	cmp w0,#0x1
00acda04	cneg w20,w20,ge
00acda08	b 0x00acda10
00acda0c	mov w20,#0xffffffff
00acda10	mov x0,x19
00acda14	bl 0x00c3fa40
00acda18	mov w0,w20
00acda1c	ldp x29,x30,[sp, #0x50]
00acda20	ldp x20,x19,[sp, #0x40]
00acda24	ldp x22,x21,[sp, #0x30]
00acda28	add sp,sp,#0x60
00acda2c	ret
00acda30	bl 0x00c342a0
00acda34	adrp x0,0x2aa000
00acda38	adrp x2,0x2ac000
00acda3c	add x0,x0,#0x8f8
00acda40	add x2,x2,#0x797
00acda44	mov w1,#0x229
00acda48	bl 0x00c342b0
00acda4c	mov w0,#0x4
00acda50	mov w1,#0x9e
00acda54	b 0x00acd988
