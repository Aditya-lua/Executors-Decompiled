/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12528..0x12548 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12528_1 {
    char padding_0[24];
    struct st_12528_2 *field_18;
} st_12528_1;

typedef struct st_12528_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_12528_0;

typedef struct st_12528_2 {
    struct st_12528_0 *field_0;
} st_12528_2;


void sub_12528(st_12528_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_18)
    {
        v0 = &v2;
        v1 = v3;
        sub_198d8(0);
    }
    goto *((void *)(*(long long *)(*(long long *)a0->field_18 + 48)));
}
