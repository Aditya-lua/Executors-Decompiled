; SSL_SESSION_set_time @ 009be7dc
009be7dc	stp x20,x19,[sp, #-0x20]!
009be7e0	stp x29,x30,[sp, #0x10]
009be7e4	add x29,sp,#0x10
009be7e8	cbz x0,0x009be850
009be7ec	ldr x8,[x0, #0x390]
009be7f0	mov x19,x1
009be7f4	mov x20,x0
009be7f8	cbz x8,0x009be858
009be7fc	ldr x0,[x8, #0x3c8]
009be800	bl 0x00c356a0
009be804	cbz w0,0x009be850
009be808	ldr x8,[x20, #0x2d8]
009be80c	str x19,[x20, #0x2e0]
009be810	tbz x8,#0x3f,0x009be81c
009be814	mov x8,xzr
009be818	str xzr,[x20, #0x2d8]
009be81c	ldr x0,[x20, #0x390]
009be820	add x9,x8,x19
009be824	lsr x8,x8,#0x3f
009be828	cmp x19,#0x0
009be82c	csel w8,w8,wzr,gt
009be830	mov x1,x20
009be834	str x9,[x20, #0x2e8]
009be838	str w8,[x20, #0x2f0]
009be83c	bl 0x009be424
009be840	ldr x8,[x20, #0x390]
009be844	ldr x0,[x8, #0x3c8]
009be848	bl 0x00c35690
009be84c	b 0x009be884
009be850	mov x19,xzr
009be854	b 0x009be884
009be858	ldr x8,[x20, #0x2d8]
009be85c	str x19,[x20, #0x2e0]
009be860	tbz x8,#0x3f,0x009be86c
009be864	mov x8,xzr
009be868	str xzr,[x20, #0x2d8]
009be86c	add x9,x8,x19
009be870	lsr x8,x8,#0x3f
009be874	cmp x19,#0x0
009be878	csel w8,w8,wzr,gt
009be87c	str x9,[x20, #0x2e8]
009be880	str w8,[x20, #0x2f0]
009be884	ldp x29,x30,[sp, #0x10]
009be888	mov x0,x19
009be88c	ldp x20,x19,[sp], #0x20
009be890	ret
