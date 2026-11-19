; FUN_00a236a4 @ 00a236a4
00a236a4	stp x20,x19,[sp, #-0x20]!
00a236a8	stp x29,x30,[sp, #0x10]
00a236ac	ldr x8,[x1, #0x20]
00a236b0	mov x19,x0
00a236b4	add x29,sp,#0x10
00a236b8	mov x20,x1
00a236bc	mov x0,x8
00a236c0	bl 0x00c36880
00a236c4	ldr x8,[x19, #0x20]
00a236c8	mov x19,x0
00a236cc	mov x0,x8
00a236d0	bl 0x00c3a7e0
00a236d4	ldr x8,[x20, #0x20]
00a236d8	mov x20,x0
00a236dc	mov x0,x8
00a236e0	bl 0x00c3a7e0
00a236e4	mov x2,x0
00a236e8	orr w0,wzr,#0xfffffffe
00a236ec	cbz x19,0x00a2371c
00a236f0	cbz x20,0x00a2371c
00a236f4	cbz x2,0x00a2371c
00a236f8	mov x0,x19
00a236fc	mov x1,x20
00a23700	mov x3,xzr
00a23704	bl 0x00c3a890
00a23708	cmp w0,#0x1
00a2370c	orr w8,wzr,#0xfffffffe
00a23710	csel w8,wzr,w8,eq
00a23714	cmp w0,#0x0
00a23718	csinc w0,w8,wzr,ne
00a2371c	ldp x29,x30,[sp, #0x10]
00a23720	ldp x20,x19,[sp], #0x20
00a23724	ret
