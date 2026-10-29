/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b9f0..0x99bcec (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b9f0_3 {
    int field_0;
    char padding_4[212];
    struct st_99b9f0_2 *field_d8;
} st_99b9f0_3;

typedef struct st_99b9f0_5 {
    char padding_0[8];
    struct st_99b9f0_0 *field_8;
    char padding_10[8];
    struct st_99b9f0_3 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[2180];
    struct st_99b9f0_4 *field_900;
} st_99b9f0_5;

typedef struct st_99b9f0_0 {
    char padding_0[560];
    struct st_99b9f0_1 *field_230;
} st_99b9f0_0;

typedef struct st_99b9f0_4 {
    char padding_0[800];
    unsigned long long field_320;
} st_99b9f0_4;

typedef struct st_99b9f0_2 {
    char padding_0[80];
    char field_50;
} st_99b9f0_2;

typedef struct st_99b9f0_1 {
    unsigned long long field_0;
} st_99b9f0_1;


unsigned long long sub_99b9f0(st_99b9f0_5 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // x23
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 112;
    v3 = a0->field_8;
    v4 = sub_962ef0();
    if (v3 && *(long long *)&a0[1].padding_7c[516])
    {
        v5 = *(long long *)(v3 + 560);
        if (!*(long long *)(v3 + 560))
        {
            v5 = *(long long *)(*(long long *)&a0[1].padding_7c[516] + 560);
            if (!*(long long *)(*(long long *)&a0[1].padding_7c[516] + 560))
            {
                if ((!*(long long *)&a0->padding_7c[484] || !*(long long *)&a0->padding_7c[620]) && v3 != *(long long *)&a0[1].padding_7c[516] && !*(int *)&a0->padding_7c[2132])
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                }
                *(unsigned int *)&a0[1].padding_7c[476] = 0;
                return 1;
            }
        }
        v5();
    }
    sub_c65188(a0);
    return 0;
}
