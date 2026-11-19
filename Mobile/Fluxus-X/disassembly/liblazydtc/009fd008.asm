; BIO_find_type @ 009fd008
009fd008	cbz x0,0x009fd040
009fd00c	and w8,w1,#0xff
009fd010	ldr x9,[x0, #0x8]
009fd014	cbz x9,0x009fd028
009fd018	ldr w9,[x9]
009fd01c	cbz w8,0x009fd034
009fd020	cmp w9,w1
009fd024	b.eq 0x009fd03c
009fd028	ldr x0,[x0, #0x48]
009fd02c	cbnz x0,0x009fd010
009fd030	b 0x009fd03c
009fd034	tst w9,w1
009fd038	b.eq 0x009fd028
009fd03c	ret
009fd040	stp x29,x30,[sp, #-0x10]!
009fd044	mov x29,sp
009fd048	bl 0x00c342a0
009fd04c	adrp x0,0x2b2000
009fd050	adrp x2,0x2ab000
009fd054	add x0,x0,#0x42
009fd058	add x2,x2,#0xe43
009fd05c	mov w1,#0x2d0
009fd060	bl 0x00c342b0
009fd064	mov w1,#0x102
009fd068	mov w0,#0x20
009fd06c	movk w1,#0xc, LSL #16
009fd070	mov x2,xzr
009fd074	bl 0x00c342c0
009fd078	mov x0,xzr
009fd07c	ldp x29,x30,[sp], #0x10
009fd080	ret
