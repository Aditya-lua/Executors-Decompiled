; ossl_ffc_params_FIPS186_4_validate @ 00a7efac
00a7efac	stp x24,x23,[sp, #-0x40]!
00a7efb0	stp x22,x21,[sp, #0x10]
00a7efb4	stp x20,x19,[sp, #0x20]
00a7efb8	stp x29,x30,[sp, #0x30]
00a7efbc	add x29,sp,#0x30
00a7efc0	cbz x1,0x00a7f030
00a7efc4	mov x23,x0
00a7efc8	ldr x0,[x1]
00a7efcc	mov x22,x1
00a7efd0	cbz x0,0x00a7f030
00a7efd4	ldr x8,[x22, #0x8]
00a7efd8	cbz x8,0x00a7f030
00a7efdc	mov x19,x4
00a7efe0	mov x20,x3
00a7efe4	mov w21,w2
00a7efe8	bl 0x00c322f0
00a7efec	ldr x8,[x22, #0x8]
00a7eff0	sxtw x24,w0
00a7eff4	mov x0,x8
00a7eff8	bl 0x00c322f0
00a7effc	mov x1,x22
00a7f000	mov w3,w21
00a7f004	mov x6,x20
00a7f008	mov x7,x19
00a7f00c	ldp x29,x30,[sp, #0x30]
00a7f010	ldp x20,x19,[sp, #0x20]
00a7f014	ldp x22,x21,[sp, #0x10]
00a7f018	sxtw x5,w0
00a7f01c	mov x0,x23
00a7f020	mov w2,wzr
00a7f024	mov x4,x24
00a7f028	ldp x24,x23,[sp], #0x40
00a7f02c	b 0x00c3dd10
00a7f030	ldp x29,x30,[sp, #0x30]
00a7f034	ldp x20,x19,[sp, #0x20]
00a7f038	ldp x22,x21,[sp, #0x10]
00a7f03c	mov w0,wzr
00a7f040	ldp x24,x23,[sp], #0x40
00a7f044	ret
