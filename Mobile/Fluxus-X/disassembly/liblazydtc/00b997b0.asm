; mbedtls_psa_rsa_export_public_key @ 00b997b0
00b997b0	sub sp,sp,#0x70
00b997b4	str x25,[sp, #0x20]
00b997b8	stp x24,x23,[sp, #0x30]
00b997bc	stp x22,x21,[sp, #0x40]
00b997c0	stp x20,x19,[sp, #0x50]
00b997c4	stp x29,x30,[sp, #0x60]
00b997c8	add x29,sp,#0x60
00b997cc	mrs x25,tpidr_el0
00b997d0	ldr x8,[x25, #0x28]
00b997d4	mov x22,x3
00b997d8	add x3,sp,#0x8
00b997dc	mov x20,x5
00b997e0	str x8,[sp, #0x18]
00b997e4	str xzr,[sp, #0x8]
00b997e8	ldrh w0,[x0]
00b997ec	mov x21,x4
00b997f0	bl 0x00c43150
00b997f4	ldr x19,[sp, #0x8]
00b997f8	mov w24,w0
00b997fc	cbnz w0,0x00b998a4
00b99800	add x24,x22,x21
00b99804	add x2,sp,#0x10
00b99808	mov x0,x19
00b9980c	mov x1,x22
00b99810	str x24,[sp, #0x10]
00b99814	bl 0x00c433d0
00b99818	mov w23,w0
00b9981c	tbnz w0,#0x1f,0x00b99858
00b99820	sbfiz x8,x23,#0x1,#0x20
00b99824	cmp x8,x21
00b99828	sxtw x23,w23
00b9982c	b.ls 0x00b99878
00b99830	cmp x23,x21
00b99834	b.cs 0x00b9989c
00b99838	sub x1,x24,x23
00b9983c	mov x0,x22
00b99840	mov x2,x23
00b99844	bl 0x00c2ff60
00b99848	add x0,x22,x23
00b9984c	sub x2,x21,x23
00b99850	mov w1,wzr
00b99854	b 0x00b99898
00b99858	mov x0,x22
00b9985c	mov w1,wzr
00b99860	mov x2,x21
00b99864	bl 0x00c301c0
00b99868	mov w0,w23
00b9986c	bl 0x00c42bf0
00b99870	mov w24,w0
00b99874	b 0x00b998a4
00b99878	sub x21,x24,x23
00b9987c	mov x0,x22
00b99880	mov x1,x21
00b99884	mov x2,x23
00b99888	bl 0x00c2ffd0
00b9988c	mov x0,x21
00b99890	mov w1,wzr
00b99894	mov x2,x23
00b99898	bl 0x00c301c0
00b9989c	mov w24,wzr
00b998a0	str x23,[x20]
00b998a4	mov x0,x19
00b998a8	bl 0x00c432d0
00b998ac	mov x0,x19
00b998b0	bl 0x00c30960
00b998b4	ldr x8,[x25, #0x28]
00b998b8	ldr x9,[sp, #0x18]
00b998bc	cmp x8,x9
00b998c0	b.ne 0x00b998e4
00b998c4	mov w0,w24
00b998c8	ldp x29,x30,[sp, #0x60]
00b998cc	ldp x20,x19,[sp, #0x50]
00b998d0	ldp x22,x21,[sp, #0x40]
00b998d4	ldp x24,x23,[sp, #0x30]
00b998d8	ldr x25,[sp, #0x20]
00b998dc	add sp,sp,#0x70
00b998e0	ret
00b998e4	bl 0x00c2fec0
