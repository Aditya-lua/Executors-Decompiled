; EVP_RAND_reseed @ 00ac9fe8
00ac9fe8	stp x24,x23,[sp, #-0x40]!
00ac9fec	stp x22,x21,[sp, #0x10]
00ac9ff0	stp x20,x19,[sp, #0x20]
00ac9ff4	stp x29,x30,[sp, #0x30]
00ac9ff8	ldr x8,[x0]
00ac9ffc	mov x20,x5
00aca000	mov x21,x4
00aca004	mov x22,x3
00aca008	ldr x9,[x8, #0x78]
00aca00c	mov x23,x2
00aca010	mov x19,x0
00aca014	mov w24,w1
00aca018	add x29,sp,#0x30
00aca01c	cbz x9,0x00aca030
00aca020	ldr x0,[x19, #0x8]
00aca024	blr x9
00aca028	cbz w0,0x00aca080
00aca02c	ldr x8,[x19]
00aca030	ldr x9,[x8, #0x60]
00aca034	cbz x9,0x00aca068
00aca038	ldr x0,[x19, #0x8]
00aca03c	mov w1,w24
00aca040	mov x2,x23
00aca044	mov x3,x22
00aca048	mov x4,x21
00aca04c	mov x5,x20
00aca050	blr x9
00aca054	ldr x8,[x19]
00aca058	mov w20,w0
00aca05c	ldr x8,[x8, #0x80]
00aca060	cbnz x8,0x00aca074
00aca064	b 0x00aca084
00aca068	mov w20,#0x1
00aca06c	ldr x8,[x8, #0x80]
00aca070	cbz x8,0x00aca084
00aca074	ldr x0,[x19, #0x8]
00aca078	blr x8
00aca07c	b 0x00aca084
00aca080	mov w20,wzr
00aca084	mov w0,w20
00aca088	ldp x29,x30,[sp, #0x30]
00aca08c	ldp x20,x19,[sp, #0x20]
00aca090	ldp x22,x21,[sp, #0x10]
00aca094	ldp x24,x23,[sp], #0x40
00aca098	ret
