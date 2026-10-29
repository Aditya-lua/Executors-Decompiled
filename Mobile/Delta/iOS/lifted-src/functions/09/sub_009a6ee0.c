/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a6ee0..0x9a6ff4 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a6ee0_1 {
    char padding_0[216];
    struct st_9a6ee0_0 *field_d8;
} st_9a6ee0_1;

typedef struct st_9a6ee0_2 {
    char padding_0[24];
    struct st_9a6ee0_1 *field_18;
    char padding_20[140];
    int field_ac;
    char padding_b0[1112];
    unsigned int field_508;
    char padding_50c[1548];
    int field_b18;
} st_9a6ee0_2;

typedef struct st_9a6ee0_0 {
    char padding_0[80];
    char field_50;
} st_9a6ee0_0;


char sub_9a6ee0(st_9a6ee0_2 *a0)
{
    int v8;  // w8
    char v0;  // [bp-0x60]
    char v1;  // [bp-0x50]
    char v2;  // [bp-0x40]
    char v3;  // [bp-0x30]
    char v4;  // [bp-0x28]
    char v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a0->field_ac > 0x11)
    {
        switch (v8)
        {
        case 18:
            if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
                goto LABEL_9a6fd8;
            if (!a0->field_508)
                goto LABEL_9a6fd8;
            *(unsigned int *)&a0->padding_b0[24] = 0;
            goto LABEL_9a6fd8;
        case 51:
            if (!*(int *)&a0->padding_b0[64])
            {
                return 2;
            }
            else if (*(int *)&a0->padding_b0[64] == 7)
            {
                return 2;
            }
        case 50:
            break;
        default:
LABEL_9a6fd8:
            return 2;
        }
    }
    else
    {
        switch (v8)
        {
        case 1:
            break;
        case 13:
            *(unsigned int *)&a0->padding_20[100] = 0;
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
            {
                if (sub_954420())
                    goto LABEL_9a6fd8;
                return 0;
            }
            if (a0->field_b18 != 1)
                goto LABEL_9a6fd8;
            v5 = 0;
            v4 = 0;
            v3 = 0;
            v1 = 0;
            v2 = 0;
            v0 = 0;
            if (sub_992148())
                goto LABEL_9a6fd8;
            return 0;
        default:
LABEL_9a6fd8:
            goto LABEL_9a6fd8;
        }
    }
}
