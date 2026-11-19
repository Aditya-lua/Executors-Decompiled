; ossl_dsa_is_foreign @ 00a201f4
00a201f4	ldr x8,[x0, #0xa8]
00a201f8	cbz x8,0x00a20204
00a201fc	mov w0,#0x1
00a20200	ret
00a20204	str x19,[sp, #-0x20]!
00a20208	stp x29,x30,[sp, #0x10]
00a2020c	add x29,sp,#0x10
00a20210	bl 0x00c3a200
00a20214	mov x19,x0
00a20218	bl 0x00c3a1f0
00a2021c	ldp x29,x30,[sp, #0x10]
00a20220	cmp x19,x0
00a20224	cset w0,ne
00a20228	ldr x19,[sp], #0x20
00a2022c	ret
