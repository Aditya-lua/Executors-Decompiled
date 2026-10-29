/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9911fc..0x991254 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9911fc_0 {
    long long field_0;
    unsigned long long field_8;
} st_9911fc_0;


int sub_9911fc(st_9911fc_0 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a2 <= a0->field_8)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        _memcpy(a1, a0->field_0);
        v8 = a0->field_8;
        a0->field_0 = a0->field_0 + a2;
        a0->field_8 = v8 - a2;
        return 1;
    }
    return 0;
}
