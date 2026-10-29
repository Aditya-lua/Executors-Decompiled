/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2aed0..0xa2afcc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2aed0_0 {
    char padding_0[8];
    struct st_a2aed0_1 *field_8;
    char padding_10[16];
    long long field_20;
} st_a2aed0_0;

typedef struct st_a2aed0_1 {
    unsigned int field_0;
} st_a2aed0_1;


long long sub_a2aed0(st_a2aed0_0 *a0, unsigned int a1, unsigned long a2, long long *a3)
{
    long long v2;  // x0
    unsigned int v3;  // w9
    long long v4;  // x0
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 != 10)
    {
        if (a1 == 9)
        {
            v2 = sub_a2a41c(0, a3);
            if (!v2)
                return v2;
            sub_a5ab14(a0, *(int *)a0->field_8, v2);
            return 1;
        }
        else
        {
            return 0xfffffffe;
        }
    }
    else
    {
        if (a0->field_20)
        {
            v3 = *(int *)a0->field_8;
            v4 = sub_a6dac4();
            *a3 = v4;
            if (!v4)
                return v4;
            switch (*(int *)a0->field_8)
            {
            case 1034:
                return 32;
            case 1087:
                return 32;
            case 1035:
                v6 = 56;
                break;
            default:
                v6 = 57;
                break;
            }
            return v6;
        }
        else
        {
            return 0;
        }
    }
}
