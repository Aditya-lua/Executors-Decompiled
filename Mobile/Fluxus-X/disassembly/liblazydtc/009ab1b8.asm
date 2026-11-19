; ssl3_init_finished_mac @ 009ab1b8
009ab1b8	stp x20,x19,[sp, #-0x20]!
009ab1bc	stp x29,x30,[sp, #0x10]
009ab1c0	add x29,sp,#0x10
009ab1c4	mov x19,x0
009ab1c8	bl 0x00c32280
009ab1cc	bl 0x00c32240
009ab1d0	cbz x0,0x009ab20c
009ab1d4	mov x20,x0
009ab1d8	ldr x0,[x19, #0x188]
009ab1dc	bl 0x00c31a40
009ab1e0	ldr x0,[x19, #0x190]
009ab1e4	str xzr,[x19, #0x188]
009ab1e8	bl 0x00c31f90
009ab1ec	mov w1,#0x9
009ab1f0	mov w2,#0x1
009ab1f4	mov x0,x20
009ab1f8	mov x3,xzr
009ab1fc	stp x20,xzr,[x19, #0x188]
009ab200	mov w19,#0x1
009ab204	bl 0x00c321a0
009ab208	b 0x009ab244
009ab20c	bl 0x00c342a0
009ab210	adrp x0,0x2a3000
009ab214	adrp x2,0x29f000
009ab218	add x0,x0,#0xb34
009ab21c	add x2,x2,#0xbbe
009ab220	mov w1,#0x144
009ab224	bl 0x00c342b0
009ab228	mov w2,#0x100
009ab22c	mov w1,#0x50
009ab230	movk w2,#0xc, LSL #16
009ab234	mov x0,x19
009ab238	mov x3,xzr
009ab23c	bl 0x00c34410
009ab240	mov w19,wzr
009ab244	ldp x29,x30,[sp, #0x10]
009ab248	mov w0,w19
009ab24c	ldp x20,x19,[sp], #0x20
009ab250	ret
