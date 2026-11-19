; FUN_0088b6b8 @ 0088b6b8
0088b6b8	sub sp,sp,#0x80
0088b6bc	stp x29,x30,[sp, #0x50]
0088b6c0	stp x22,x21,[sp, #0x60]
0088b6c4	stp x20,x19,[sp, #0x70]
0088b6c8	add x29,sp,#0x50
0088b6cc	mrs x22,tpidr_el0
0088b6d0	mov x21,x1
0088b6d4	mov x19,x0
0088b6d8	ldr x8,[x22, #0x28]
0088b6dc	stur x8,[x29, #-0x8]
0088b6e0	ldr x1,[x1, #0x20]
0088b6e4	bl 0x0088df20
0088b6e8	tbnz w0,#0x1f,0x0088b720
0088b6ec	ldr x1,[x21, #0x28]
0088b6f0	ldr x8,[x22, #0x28]
0088b6f4	ldur x9,[x29, #-0x8]
0088b6f8	cmp x8,x9
0088b6fc	b.ne 0x0088b808
0088b700	mov w2,w0
0088b704	mov x0,x19
0088b708	mov w3,wzr
0088b70c	ldp x20,x19,[sp, #0x70]
0088b710	ldp x22,x21,[sp, #0x60]
0088b714	ldp x29,x30,[sp, #0x50]
0088b718	add sp,sp,#0x80
0088b71c	b 0x0088d1d0
0088b720	ldr w20,[x19, #0x64c]
0088b724	stur x19,[x29, #-0x18]
0088b728	add w8,w20,#0x1
0088b72c	stur w20,[x29, #-0x10]
0088b730	cmp w8,#0x100
0088b734	b.cs 0x0088b7bc
0088b738	ldr w9,[x19, #0x650]
0088b73c	ldr x1,[x21, #0x28]
0088b740	str w8,[x19, #0x64c]
0088b744	cmp w9,w8
0088b748	csel w8,w9,w8,hi
0088b74c	str w8,[x19, #0x650]
0088b750	mov x0,x19
0088b754	mov w2,w20
0088b758	mov w3,#0x1
0088b75c	bl 0x0088d1d0
0088b760	ldr x1,[x21, #0x20]
0088b764	add x8,sp,#0x8
0088b768	sub x2,x29,#0x18
0088b76c	mov x0,x19
0088b770	bl 0x00899540
0088b774	ldr x4,[x21, #0x20]
0088b778	add x1,sp,#0x8
0088b77c	mov x0,x19
0088b780	mov w2,w20
0088b784	mov w3,#0x1
0088b788	bl 0x00892774
0088b78c	ldur w8,[x29, #-0x10]
0088b790	ldur x9,[x29, #-0x18]
0088b794	str w8,[x9, #0x64c]
0088b798	ldr x8,[x22, #0x28]
0088b79c	ldur x9,[x29, #-0x8]
0088b7a0	cmp x8,x9
0088b7a4	b.ne 0x0088b808
0088b7a8	ldp x20,x19,[sp, #0x70]
0088b7ac	ldp x22,x21,[sp, #0x60]
0088b7b0	ldp x29,x30,[sp, #0x50]
0088b7b4	add sp,sp,#0x80
0088b7b8	ret
0088b7bc	ldr x8,[x22, #0x28]
0088b7c0	ldur x9,[x29, #-0x8]
0088b7c4	cmp x8,x9
0088b7c8	b.ne 0x0088b808
0088b7cc	adrp x1,0x2d0000
0088b7d0	add x1,x1,#0xc00
0088b7d4	add x0,x21,#0xc
0088b7d8	mov w2,#0x1
0088b7dc	mov w3,#0xff
0088b7e0	bl 0x0087fcd8
0088b808	bl 0x00c2fec0
