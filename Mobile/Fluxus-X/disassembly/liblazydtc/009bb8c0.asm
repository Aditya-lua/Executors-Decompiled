; FUN_009bb8c0 @ 009bb8c0
009bb8c0	sub sp,sp,#0x40
009bb8c4	stp x20,x19,[sp, #0x20]
009bb8c8	mov x20,x1
009bb8cc	mov x19,x0
009bb8d0	add x1,sp,#0x8
009bb8d4	mov x0,x20
009bb8d8	stp x22,x21,[sp, #0x10]
009bb8dc	stp x29,x30,[sp, #0x30]
009bb8e0	add x29,sp,#0x30
009bb8e4	bl 0x00c35150
009bb8e8	cbz x0,0x009bb944
009bb8ec	ldr x8,[sp, #0x8]
009bb8f0	mov w9,#0x28
009bb8f4	madd x9,x8,x9,x19
009bb8f8	ldr x0,[x9, #0x20]
009bb8fc	cbz x0,0x009bb910
009bb900	mov x1,x20
009bb904	bl 0x00c35c40
009bb908	cbz w0,0x009bb974
009bb90c	ldr x8,[sp, #0x8]
009bb910	mov w21,#0x28
009bb914	add x22,x19,#0x20
009bb918	madd x8,x8,x21,x22
009bb91c	ldr x0,[x8, #0x8]
009bb920	bl 0x00c32450
009bb924	mov x0,x20
009bb928	bl 0x00c34730
009bb92c	ldr x8,[sp, #0x8]
009bb930	mov w0,#0x1
009bb934	madd x8,x8,x21,x22
009bb938	str x20,[x8, #0x8]
009bb93c	str x8,[x19]
009bb940	b 0x009bb974
009bb944	bl 0x00c342a0
009bb948	adrp x0,0x2db000
009bb94c	adrp x2,0x2a7000
009bb950	add x0,x0,#0xaec
009bb954	add x2,x2,#0xb42
009bb958	mov w1,#0x7b
009bb95c	bl 0x00c342b0
009bb960	mov w0,#0x14
009bb964	mov w1,#0xf7
009bb968	mov x2,xzr
009bb96c	bl 0x00c342c0
009bb970	mov w0,wzr
009bb974	ldp x29,x30,[sp, #0x30]
009bb978	ldp x20,x19,[sp, #0x20]
009bb97c	ldp x22,x21,[sp, #0x10]
009bb980	add sp,sp,#0x40
009bb984	ret
