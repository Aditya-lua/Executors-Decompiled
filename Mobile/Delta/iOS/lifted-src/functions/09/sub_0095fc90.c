/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fc90..0x95fdc4 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fc90_0 {
    char padding_0[120];
    struct st_95fc90_1 *field_78;
} st_95fc90_0;

typedef struct st_95fc90_2 {
    unsigned int field_0;
    char padding_4[20];
    struct st_95fc90_0 *field_18;
} st_95fc90_2;

typedef struct st_95fc90_1 {
    unsigned long long field_0;
} st_95fc90_1;


unsigned int sub_95fc90(st_95fc90_2 *a0)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0xffffffff;
    v2 = a0->field_0;
    v3 = a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            v3 = 0;
        else
            v3 = sub_980dc8(a0);
        if (!v3)
            return 0xffffffff;
    }
    if (!*(long long *)(v3 + 112))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 0x135a, "SSL_do_handshake");
        sub_a36abc(20, 144, 0);
        return 0xffffffff;
    }
    else if (sub_9a59b8(v3, 0xffffffff))
    {
        a0->field_18->field_78();
    }
    else
    {
        return 0xffffffff;
    }
}
