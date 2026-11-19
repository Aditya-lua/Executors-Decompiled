; FUN_00bf9740 @ 00bf9740
00bf9740	paciasp
00bf9744	sub sp,sp,#0x50
00bf9748	stp x29,x30,[sp, #0x20]
00bf974c	stp x22,x21,[sp, #0x30]
00bf9750	stp x20,x19,[sp, #0x40]
00bf9754	add x29,sp,#0x20
00bf9758	adrp x20,0xcb5000
00bf975c	mov x19,x1
00bf9760	mov x21,x0
00bf9764	ldr x20,[x20, #0xd10]
00bf9768	str x20,[sp, #0x8]
00bf976c	ldar x8,[x20]
00bf9770	cmn x8,#0x1
00bf9774	b.eq 0x00bf97a0
00bf9778	add x8,sp,#0x8
00bf977c	sub x9,x29,#0x8
00bf9780	adrp x0,0xcb5000
00bf9784	stur x8,[x29, #-0x8]
00bf9788	nop
00bf978c	adr x2,0xc0bab0
00bf9790	str x9,[sp, #0x10]
00bf9794	add x1,sp,#0x10
00bf9798	ldr x0,[x0, #0xd10]
00bf979c	bl 0x00c305d0
00bf97a0	ldp x8,x10,[x19, #0x10]
00bf97a4	ldrsw x9,[x20, #0x8]
00bf97a8	sub x22,x9,#0x1
00bf97ac	sub x9,x10,x8
00bf97b0	cmp x22,x9, ASR #0x3
00bf97b4	b.cs 0x00bf9854
00bf97b8	ldr x19,[x8, x22, LSL #0x3]
00bf97bc	cbz x19,0x00bf9854
00bf97c0	add x1,x19,#0x8
00bf97c4	mov w0,#0x1
00bf97c8	bl 0x00c2bce0
00bf97cc	mov x20,x21
00bf97d0	ldp x8,x9,[x20, #0x10]!
00bf97d4	sub x9,x9,x8
00bf97d8	asr x10,x9,#0x3
00bf97dc	cmp x10,x22
00bf97e0	b.hi 0x00bf980c
00bf97e4	add x9,x22,#0x1
00bf97e8	subs x1,x9,x10
00bf97ec	b.ls 0x00bf9800
00bf97f0	mov x0,x20
00bf97f4	bl 0x00c0b6e4
00bf97f8	ldr x8,[x20]
00bf97fc	b 0x00bf980c
00bf9800	b.cs 0x00bf980c
00bf9804	add x9,x8,x9, LSL #0x3
00bf9808	str x9,[x21, #0x18]
00bf980c	ldr x21,[x8, x22, LSL #0x3]
00bf9810	cbz x21,0x00bf9834
00bf9814	add x1,x21,#0x8
00bf9818	mov x0,#-0x1
00bf981c	bl 0x00c2bd10
00bf9820	cbnz x0,0x00bf9834
00bf9824	ldr x8,[x21]
00bf9828	mov x0,x21
00bf982c	ldr x8,[x8, #0x10]
00bf9830	blr x8
00bf9834	ldr x8,[x20]
00bf9838	str x19,[x8, x22, LSL #0x3]
00bf983c	ldp x20,x19,[sp, #0x40]
00bf9840	ldp x22,x21,[sp, #0x30]
00bf9844	ldp x29,x30,[sp, #0x20]
00bf9848	add sp,sp,#0x50
00bf984c	autiasp
00bf9850	ret
00bf9854	bl 0x00bd8968
