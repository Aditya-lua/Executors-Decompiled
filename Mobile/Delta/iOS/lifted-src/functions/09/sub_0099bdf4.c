/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bdf4..0x99beb0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bdf4_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[644];
    struct st_99bdf4_1 *field_300;
    char padding_308[1904];
    unsigned long long field_a78;
    unsigned long long field_a80;
} st_99bdf4_0;

typedef struct st_99bdf4_1 {
    char padding_0[28];
    unsigned int field_1c;
    unsigned int field_20;
} st_99bdf4_1;


unsigned int sub_99bdf4(st_99bdf4_0 *a0)
{
    unsigned long v5;  // x8
    unsigned long v6;  // x9
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long v10;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_78)
    {
        return 1;
    }
    else if (!*(long long *)&a0->padding_308[1896])
    {
        return 1;
    }
    else if (!*(long long *)&a0->padding_308[1888])
    {
        return 1;
    }
    else
    {
        v5 = a0->field_a80;
        if (!a0->field_a80)
            return 1;
        v6 = a0->field_a78;
        if (!a0->field_a78)
            return 1;
        v0 = v7;
        v1 = v8;
        v2 = &v4;
        v3 = v9;
        if (!(a0->field_300->field_1c & 4) && !(a0->field_300->field_20 & 8))
            return 1;
        while (1)
        {
            v10 = v6;
            if (!*(char *)v5)
                break;
            v5 += 1;
            v6 = v10 - 1;
            if (v10 == 1)
                goto LABEL_99be6c;
        }
        if (!v10)
        {
LABEL_99be6c:
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions.c", 1069, "final_ec_pt_formats");
            sub_9a58a4(a0, 47, 157, 0);
            return 0;
        }
        return 1;
    }
}
