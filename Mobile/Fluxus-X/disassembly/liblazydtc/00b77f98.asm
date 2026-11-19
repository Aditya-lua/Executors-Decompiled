; mbedtls_gcm_auth_decrypt @ 00b77f98
00b77f98	sub sp,sp,#0x70
00b77f9c	str x25,[sp, #0x20]
00b77fa0	stp x24,x23,[sp, #0x30]
00b77fa4	stp x22,x21,[sp, #0x40]
00b77fa8	stp x20,x19,[sp, #0x50]
00b77fac	stp x29,x30,[sp, #0x60]
00b77fb0	add x29,sp,#0x60
00b77fb4	mrs x25,tpidr_el0
00b77fb8	ldr x8,[x25, #0x28]
00b77fbc	mov x19,x1
00b77fc0	mov w1,wzr
00b77fc4	mov x20,x7
00b77fc8	mov x21,x6
00b77fcc	mov x23,x5
00b77fd0	mov x24,x4
00b77fd4	mov x22,x0
00b77fd8	str x8,[sp, #0x18]
00b77fdc	bl 0x00c421d0
00b77fe0	cbnz w0,0x00b78054
00b77fe4	mov x0,x22
00b77fe8	mov x1,x24
00b77fec	mov x2,x23
00b77ff0	bl 0x00c421f0
00b77ff4	cbnz w0,0x00b78054
00b77ff8	ldp x1,x23,[x29, #0x10]
00b77ffc	mov x5,sp
00b78000	mov x0,x22
00b78004	mov x2,x19
00b78008	mov x3,x23
00b7800c	mov x4,x19
00b78010	bl 0x00c421e0
00b78014	cbnz w0,0x00b78054
00b78018	mov x3,sp
00b7801c	add x4,sp,#0x8
00b78020	mov x0,x22
00b78024	mov x5,x20
00b78028	bl 0x00c421c0
00b7802c	cbnz w0,0x00b78054
00b78030	add x1,sp,#0x8
00b78034	mov x0,x21
00b78038	mov x2,x20
00b7803c	bl 0x00c42190
00b78040	cbz w0,0x00b78054
00b78044	mov x0,x23
00b78048	mov x1,x19
00b7804c	bl 0x00c42220
00b78050	mov w0,#0xffffffee
00b78054	ldr x8,[x25, #0x28]
00b78058	ldr x9,[sp, #0x18]
00b7805c	cmp x8,x9
00b78060	b.ne 0x00b78080
00b78064	ldp x29,x30,[sp, #0x60]
00b78068	ldp x20,x19,[sp, #0x50]
00b7806c	ldp x22,x21,[sp, #0x40]
00b78070	ldp x24,x23,[sp, #0x30]
00b78074	ldr x25,[sp, #0x20]
00b78078	add sp,sp,#0x70
00b7807c	ret
00b78080	bl 0x00c2fec0
