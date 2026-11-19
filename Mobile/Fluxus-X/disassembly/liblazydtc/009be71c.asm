; SSL_SESSION_set_timeout @ 009be71c
009be71c	stp x20,x19,[sp, #-0x20]!
009be720	mov x19,x0
009be724	mov x0,xzr
009be728	stp x29,x30,[sp, #0x10]
009be72c	add x29,sp,#0x10
009be730	cbz x19,0x009be7b8
009be734	mov x20,x1
009be738	tbnz x1,#0x3f,0x009be7b8
009be73c	ldr x8,[x19, #0x390]
009be740	cbz x8,0x009be78c
009be744	ldr x0,[x8, #0x3c8]
009be748	bl 0x00c356a0
009be74c	cbz w0,0x009be7b4
009be750	ldr x8,[x19, #0x2e0]
009be754	ldr x0,[x19, #0x390]
009be758	lsr x9,x20,#0x3f
009be75c	mov x1,x19
009be760	cmp x8,#0x0
009be764	add x10,x8,x20
009be768	csel w8,w9,wzr,gt
009be76c	str x20,[x19, #0x2d8]
009be770	str x10,[x19, #0x2e8]
009be774	str w8,[x19, #0x2f0]
009be778	bl 0x009be424
009be77c	ldr x8,[x19, #0x390]
009be780	ldr x0,[x8, #0x3c8]
009be784	bl 0x00c35690
009be788	b 0x009be7ac
009be78c	ldr x8,[x19, #0x2e0]
009be790	lsr x9,x20,#0x3f
009be794	str x20,[x19, #0x2d8]
009be798	cmp x8,#0x0
009be79c	add x10,x8,x20
009be7a0	csel w8,w9,wzr,gt
009be7a4	str x10,[x19, #0x2e8]
009be7a8	str w8,[x19, #0x2f0]
009be7ac	mov w0,#0x1
009be7b0	b 0x009be7b8
009be7b4	mov x0,xzr
009be7b8	ldp x29,x30,[sp, #0x10]
009be7bc	ldp x20,x19,[sp], #0x20
009be7c0	ret
