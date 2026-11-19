; evp_pkey_get_legacy @ 00a6d87c
00a6d87c	sub sp,sp,#0x30
00a6d880	stp x20,x19,[sp, #0x10]
00a6d884	stp x29,x30,[sp, #0x20]
00a6d888	add x29,sp,#0x20
00a6d88c	str xzr,[sp, #0x8]
00a6d890	cbz x0,0x00a6d918
00a6d894	ldr x20,[x0, #0x20]
00a6d898	mov x19,x0
00a6d89c	cbnz x20,0x00a6d8a8
00a6d8a0	ldr x8,[x19, #0x68]
00a6d8a4	cbz x8,0x00a6d918
00a6d8a8	ldr x8,[x19, #0x60]
00a6d8ac	cbz x8,0x00a6d91c
00a6d8b0	ldr x0,[x19, #0x38]
00a6d8b4	bl 0x00c35680
00a6d8b8	cbz w0,0x00a6d918
00a6d8bc	ldr x0,[x19, #0x38]
00a6d8c0	ldr x20,[x19, #0x28]
00a6d8c4	bl 0x00c35690
00a6d8c8	cbz w0,0x00a6d918
00a6d8cc	cbnz x20,0x00a6d91c
00a6d8d0	add x0,sp,#0x8
00a6d8d4	mov x1,x19
00a6d8d8	bl 0x00a6c140
00a6d8dc	cbz w0,0x00a6d930
00a6d8e0	ldr x0,[x19, #0x38]
00a6d8e4	bl 0x00c356a0
00a6d8e8	cbz w0,0x00a6d930
00a6d8ec	ldr x20,[x19, #0x28]
00a6d8f0	cbnz x20,0x00a6d904
00a6d8f4	ldr x8,[sp, #0x8]
00a6d8f8	ldr x20,[x8, #0x20]
00a6d8fc	str x20,[x19, #0x28]
00a6d900	str xzr,[x8, #0x20]
00a6d904	ldr x0,[x19, #0x38]
00a6d908	bl 0x00c35690
00a6d90c	cmp w0,#0x0
00a6d910	csel x20,xzr,x20,eq
00a6d914	b 0x00a6d934
00a6d918	mov x20,xzr
00a6d91c	mov x0,x20
00a6d920	ldp x29,x30,[sp, #0x20]
00a6d924	ldp x20,x19,[sp, #0x10]
00a6d928	add sp,sp,#0x30
00a6d92c	ret
00a6d930	mov x20,xzr
00a6d934	ldr x0,[sp, #0x8]
00a6d938	bl 0x00a6c7fc
00a6d93c	b 0x00a6d91c
