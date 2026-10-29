/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3dc0..0x9d3fd0 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3dc0_0 {
    unsigned long long field_0;
    struct st_9d3dc0_0 *field_8;
    struct st_9d3dc0_0 *field_10;
    struct st_9d3dc0_0 *field_18;
    struct st_9d3dc0_0 *field_20;
    struct st_9d3dc0_0 *field_28;
} st_9d3dc0_0;


unsigned long long sub_9d3dc0(st_9d3dc0_0 *a0, unsigned long a1, unsigned long long a2, unsigned long a3)
{
    long long v2;  // x19
    st_9d3dc0_0 *v3;  // x9
    unsigned long long v4;  // x22
    long long v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 786690;
    if (!a0)
    {
        v4 = 0xffffffff;
        v5 = 267;
    }
    else if (a0->field_8 && a0->field_8->field_20)
    {
        v3 = a0->field_18;
        if (a0->field_10)
        {
            if (!v3)
            {
                if (a2 > 0x7fffffff)
                    return 0xffffffff;
                a0->field_10();
            }
            else
            {
                v3();
            }
        }
        else
        {
            if (v3)
            {
                v3();
            }
            else if ((int)a0->field_28)
            {
                a0->field_8->field_20();
            }
            else
            {
                v4 = 0xffffffff;
                v2 = 120;
                v5 = 279;
            }
        }
    }
    else
    {
        v4 = 0xfffffffe;
        v2 = 121;
        v5 = 271;
    }
    sub_a368c8();
    sub_a369bc("crypto/bio/bio_lib.c", v5, "bio_read_intern");
    sub_a36abc(32, v2, 0);
    return v4;
}
