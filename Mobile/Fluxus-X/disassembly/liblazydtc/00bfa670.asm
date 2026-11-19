; FUN_00bfa670 @ 00bfa670
00bfa670	paciasp
00bfa674	sub sp,sp,#0x50
00bfa678	stp x29,x30,[sp, #0x20]
00bfa67c	stp x22,x21,[sp, #0x30]
00bfa680	stp x20,x19,[sp, #0x40]
00bfa684	add x29,sp,#0x20
00bfa688	adrp x20,0xcb5000
00bfa68c	mov x19,x1
00bfa690	mov x21,x0
00bfa694	ldr x20,[x20, #0xd70]
00bfa698	str x20,[sp, #0x8]
00bfa69c	ldar x8,[x20]
00bfa6a0	cmn x8,#0x1
00bfa6a4	b.eq 0x00bfa6d0
00bfa6a8	add x8,sp,#0x8
00bfa6ac	sub x9,x29,#0x8
00bfa6b0	adrp x0,0xcb5000
00bfa6b4	stur x8,[x29, #-0x8]
00bfa6b8	nop
00bfa6bc	adr x2,0xc0bab0
00bfa6c0	str x9,[sp, #0x10]
00bfa6c4	add x1,sp,#0x10
00bfa6c8	ldr x0,[x0, #0xd70]
00bfa6cc	bl 0x00c305d0
00bfa6d0	ldp x8,x10,[x19, #0x10]
00bfa6d4	ldrsw x9,[x20, #0x8]
00bfa6d8	sub x22,x9,#0x1
00bfa6dc	sub x9,x10,x8
00bfa6e0	cmp x22,x9, ASR #0x3
00bfa6e4	b.cs 0x00bfa784
00bfa6e8	ldr x19,[x8, x22, LSL #0x3]
00bfa6ec	cbz x19,0x00bfa784
00bfa6f0	add x1,x19,#0x8
00bfa6f4	mov w0,#0x1
00bfa6f8	bl 0x00c2bce0
00bfa6fc	mov x20,x21
00bfa700	ldp x8,x9,[x20, #0x10]!
00bfa704	sub x9,x9,x8
00bfa708	asr x10,x9,#0x3
00bfa70c	cmp x10,x22
00bfa710	b.hi 0x00bfa73c
00bfa714	add x9,x22,#0x1
00bfa718	subs x1,x9,x10
00bfa71c	b.ls 0x00bfa730
00bfa720	mov x0,x20
00bfa724	bl 0x00c0b6e4
00bfa728	ldr x8,[x20]
00bfa72c	b 0x00bfa73c
00bfa730	b.cs 0x00bfa73c
00bfa734	add x9,x8,x9, LSL #0x3
00bfa738	str x9,[x21, #0x18]
00bfa73c	ldr x21,[x8, x22, LSL #0x3]
00bfa740	cbz x21,0x00bfa764
00bfa744	add x1,x21,#0x8
00bfa748	mov x0,#-0x1
00bfa74c	bl 0x00c2bd10
00bfa750	cbnz x0,0x00bfa764
00bfa754	ldr x8,[x21]
00bfa758	mov x0,x21
00bfa75c	ldr x8,[x8, #0x10]
00bfa760	blr x8
00bfa764	ldr x8,[x20]
00bfa768	str x19,[x8, x22, LSL #0x3]
00bfa76c	ldp x20,x19,[sp, #0x40]
00bfa770	ldp x22,x21,[sp, #0x30]
00bfa774	ldp x29,x30,[sp, #0x20]
00bfa778	add sp,sp,#0x50
00bfa77c	autiasp
00bfa780	ret
00bfa784	bl 0x00bd8968
